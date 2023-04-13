package com.flaviobrf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@Order(2)
@DisplayName("Tests for class calculator")
class CalculatorTest {



		private Calculator calculator;

		@BeforeAll
		static void setup() {
			System.out.println("Executing @Beforeall method");
		}

		@AfterAll
		static void cleanup() {
			System.out.println("Executing @AfterAll method");
			;
		}

		@BeforeEach
		void beforeAllMethod() {
			calculator = new Calculator();
			System.out.println("Executing before each test");
		}
		
		@ParameterizedTest
		@ValueSource( ints = {40, 41})
		void valueSourceAnnotationTest( Integer age) {
			System.out.println("the age is "+ age);
		}
		
		// um padrao para identificar os testes é adicionar nomear conforme abaixo (eu
		// nao
//		vejo muito retornar o esperado explicito):
		// test<sistema a ser testado>_<condição ou mudança de estado a ser
		// testada>_<resultado experado>

		@DisplayName(value = "test 4/2=2")
		@Test
		void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
			// given

			int expected = 2;

			// when
			int actual = calculator.IntDivision(4, 2);

			// then
			assertEquals(expected, actual, "the division in method 4/2 failed!");
			System.out.println("printing integer division");

		}

		// @Disabled(value = "TODO: Adjust the execption")
		@Test
		@DisplayName("when divided by 0 return exception")
		void testIntegrationDivision_WHenDividedByZero_ShouldReturnEnigmaticException() {

			// pode ser feito o executable dento de uma expressao lambda do assertthrow com
			assertThrows(ArithmeticException.class, () -> calculator.IntDivision(10, 0));
	//
//			Executable executable = () -> calculator.IntDivision(10, 0);
//			assertThrows(NullPointerException.class, executable);
			System.out.println("Executing division execption test");

		}

		@DisplayName("test 5-2=3")
		@Test
		void testIntegerSubtraction() {
			Calculator calculator = new Calculator();
			int actual = calculator.integerSubtraction(5, 2);
//			assertEquals(3, actual, "the subtraction 5 - 2 failed!");

//			usando lambda para a performance, pois a msg so vai ser processada se invocada, isso pode
//			afetar sistemas grandes e com mais variavies na msg de info do erro do teste
			assertEquals(3, actual, () -> "the subtraction 5 - 2 failed!");
			System.out.println("Executing subtraction test");

		}

		@DisplayName("Parameterized Subtraction")
		@ParameterizedTest
		//@MethodSource("inputSubtractionParameters")
		@CsvSource({"100, 50, 50", 
			"12, 8, 4",
			"10,2,8"})
//		@CsvFileSource(resources =  "/subtractionValues.csv", numLinesToSkip = 1)
		void ParameterizedIntegerSubtraction(int minuend, int subtrahend, int expected) {
			
			int actual = calculator.integerSubtraction(minuend, subtrahend);

			assertEquals(expected, actual);
			System.out.println("Executing subtraction test");

		}
		
		private static Stream<Arguments> inputSubtractionParameters(){
			
			return Stream.of(Arguments.of(10, 6, 4),
							 Arguments.of(12,4 ,8),
							 Arguments.of(10, 9, 1));
			
		}

	}



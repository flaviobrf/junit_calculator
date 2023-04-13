package com.flaviobrf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

@Order(1)
public class RepeteatedCalculatorTest {

	private Calculator calculator;

	@BeforeEach
	void setup() {
		calculator = new Calculator();

	}

	@DisplayName("Subtration Repeteated Test")
	@RepeatedTest(value = 3, name = "{displayName} repeteating test: {currentRepetition} of {totalRepetitions}")
	void repeteatedSubtractionTest(RepetitionInfo repetitionInfo, TestInfo testInfo) {
		

		// given
		int minuend = 12;
		int subtrahend = 5;
		int expected = 7;

		// when
		int actual = calculator.integerSubtraction(minuend, subtrahend);

		// then
		assertEquals(expected, actual);

	}

}

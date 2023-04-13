package com.flaviobrf;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.provider.MethodSource;

@Order(6)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestsIndexOrdered {
	
	@Order(3)
	@Test
	void testA() {
		System.out.println("Test A");
	}
	
	@Order(4)
	@Test
	void testD() {
		System.out.println("Test D");
	}
	
	@Order(2)
	@Test
	void testB() {
		System.out.println("Test B");
	}
	
	@Order(5)
	@Test
	void testC() {
		System.out.println("Test C");
	}
	

}

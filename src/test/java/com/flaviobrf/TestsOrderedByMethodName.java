package com.flaviobrf;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(5)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class TestsOrderedByMethodName {
	
	@Test
	void testA() {
		System.out.println("Test A");
	}
	
	
	@Test
	void testD() {
		System.out.println("Test D");
	}
	
	@Test
	void testB() {
		System.out.println("Test B");
	}
	
	@Test
	void testC() {
		System.out.println("Test C");
	}
	
	
}

package com.flaviobrf;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(4)
@TestMethodOrder(MethodOrderer.Random.class)
public class TestsRandomOrder {
	
	@Test
	void testA() {
		System.out.println("Test A");
	}
	
	@Test
	void testB() {
		System.out.println("Test B");
	}
	
	@Test
	void testC() {
		System.out.println("Test C");
	}
	
	@Test
	void testD() {
		System.out.println("Test D");
	}
}

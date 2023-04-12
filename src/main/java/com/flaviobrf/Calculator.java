package com.flaviobrf;

public class Calculator {

	public int IntDivision(int dividend, int divisor) {
		
		if (divisor == 0) {
			throw new ArithmeticException("Not allowed Divided by zero");
		}

		return dividend / divisor;

	}
	
	public int integerSubtraction(int minuend, int subtrahend) {
	    return minuend - subtrahend;
	}

}

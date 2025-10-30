package com.prem.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math= new MyMath();

	@Test
	void calculateSum_ThreeMemeberArray() {
		int expectedResult=6;
		assertEquals(expectedResult, math.calculateSum(new int[] {1,2,3}));		
	}
	
	@Test
	void calculateSum_ZeroMemeberArray() {
		int expectedResult=0;
		assertEquals(expectedResult, math.calculateSum(new int[] {}));		
	}

}

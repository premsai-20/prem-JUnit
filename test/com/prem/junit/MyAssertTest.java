package com.prem.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	List<String> todos = Arrays.asList("AWS","AZURE","CLOUD");

	@Test
	void test() {
		boolean test = todos.contains("AWS");
		assertEquals(true, test);
		assertEquals(3, todos.size(), "Size is not 3");
		assertTrue(test);
		//assertFalse(test);
		//assertNull,assertNotNul
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}

}

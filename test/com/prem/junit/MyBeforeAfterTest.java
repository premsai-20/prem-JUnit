package com.prem.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	
	@BeforeEach
	void beforeEach() {
		System.out.println("BeforeEach");
	}
	@Test
	void test1() {
		System.out.println("test1");
	}

	@Test
	void test2() {
		System.out.println("test2");
	}
	@Test
	void test3() {
		System.out.println("test3");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("AfterEach");
	}

}

package com.Testng_Test;

import org.testng.annotations.Test;

public class YY {

	@Test(priority = 1)
	public void testCase1_YY() {
		System.out.println("testCase1_YY.start..");
		System.out.println("testCase1_YY.end..");
	}

// 3 ways
	@Test(priority = 2)
	public void testCase2_YY() {
		System.out.println("testCase2_YY.start..");
		System.out.println("testCase2_YY.end..");
	}

}

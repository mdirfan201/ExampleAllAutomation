package com.TestRunner;

import org.testng.annotations.Test;

public class ExceptionTimeoutTestNg {

//	@Test(invocationTimeOut=2, expectedExceptions=NumberFormatException.class)
//	public void infiniteLoop1() {
//		int i=1;
//		while(i==1) {
//			System.out.println(i);
//		}
//	}
	
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void test1() {
		String x="100A";
		Integer.parseInt(x);
	}
}

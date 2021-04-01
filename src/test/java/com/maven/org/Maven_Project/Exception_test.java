package com.maven.org.Maven_Project;

import org.testng.annotations.Test;

public class Exception_test {
@Test
	private void arith() {
 
       int i=10;
       int j=10;
       System.out.println(i+j);
	}
@Test(expectedExceptions = ArithmeticException.class)
	private void arithmetic() {

		int i=10;
		int j=0;
		System.out.println(i/j);
	}

}

package com.maven.org.Maven_Project;

import org.testng.annotations.Test;

public class Time_out {
	@Test
	private void olabooking() {
		System.out.println("booked");
	}
	@Test
	private void confirmed() {
System.out.println("confirm");
	}
	@Test(timeOut =3000)  
	private void riding() {
System.out.println("ridestart");
	}
	@Test
	private void destination() {
System.out.println("reached");
	}

}

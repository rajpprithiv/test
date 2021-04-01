package com.maven.org.Maven_Project;

import org.testng.annotations.Test;

public class Ignore_Test {
	
	@Test (enabled = false)
	public void name() {
System.out.println("arjun");
	}
@Test
	private void age() {
System.out.println("25");
	}
@Test
	private void address() {
System.out.println("chennai");
	}
	@Test
	private void state() {
System.out.println("Tamilnadu");
	}
}

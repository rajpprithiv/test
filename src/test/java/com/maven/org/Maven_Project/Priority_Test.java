package com.maven.org.Maven_Project;

import org.testng.annotations.Test;

public class Priority_Test {
	@Test (priority = -1)
	private void Wakeup() {
System.out.println("wakeup");
	}
	@Test (priority = -4)
	private void Brush() {
System.out.println("brush");
	}
	@Test(priority = 1)
  private void office() {
	System.out.println("office");
}
  @Test(priority = 1)
  private void work() {
System.out.println("workhours");
}
}

package com.maven.org.Maven_Project;

import org.testng.annotations.Test;

public class Grouptest {
	@Test(groups = "Company Details")
	private void empname() {
System.out.println("rohit");
	}
	@Test(groups = "Company Details")

	private void empid() {
System.out.println("1233");
	}
	@Test(groups = "Company Details")
	private void empsalary() {
System.out.println("14lpa");
	}
	@Test(groups = "Personal Details")
	private void empaccno() {
System.out.println("234678");
	}
	@Test(groups = "Personal Details")
private void empmobile() {
System.out.println("348923213");
}

}


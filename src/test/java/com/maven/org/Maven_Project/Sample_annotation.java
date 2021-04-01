package com.maven.org.Maven_Project;

import org.testng.annotations.*;

public class Sample_annotation {

	
	@BeforeSuite
public void setup() {
	System.out.println("setup");
	}
	@BeforeTest
	public void browserlaunch() {
		System.out.println("browserlaunch");
}
	
	@BeforeClass
	public void url()  {
		System.out.println("url");
		
	}
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	
 @Test
     public void restuarantr() {
System.out.println("restuaratr");
	}

 @AfterMethod
 public void logout() {
	 System.out.println("logout");

}
 @AfterClass
 public void browserclose() {
	 System.out.println("browserclose");

}
 @AfterSuite
 public void mainpage() {
	 System.out.println("cookies delete");

}
 
}

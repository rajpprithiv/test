package com.maven.org.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters({"username","password"})
	private void credential( String username,String password) {
System.out.println("username = "+ username   +  "    password = "+ password);

	}
}

//optional tag is used for to find the mismatch string in .xml 
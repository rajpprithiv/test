package com.maven.org.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebook_testng {
	

	@Test
	//@Parameters({username,password})
public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prithiviraj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}

}

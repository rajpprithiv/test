package com.maven.org.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {
	
	@Test
	public void amazon() {

     System.setProperty("webdriver.chrome.driver","C:\\Users\\prithiviraj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
     WebDriver driver =new ChromeDriver();
     driver.get("https://www.amazon.in/");
    
	}
	@Test
public void facebook() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prithiviraj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.facebook.com/");
    
    WebElement userr = driver.findElement(By.id("email"));
    userr.sendKeys("prithiv");
    WebElement pas = driver.findElement(By.id("pass"));
pas.sendKeys("125463");
	
	}
@Test	
public void flipkart() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prithiviraj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.flipkart.com/");
}
@Test
public void twitter() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prithiviraj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("https://twitter.com/?lang=en");
}
@Test
public void zomato() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prithiviraj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.zomato.com/akola/restaurants?context=delivery");
}

}

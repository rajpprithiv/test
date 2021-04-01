package com.maven.org.Maven_Project;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void getCurrentUrl(String url) {
		driver.getCurrentUrl();
	}

	public static void getTitle(String url) {
		driver.getTitle();
	}

	public static void findelements(WebElement element) {
		driver.findElements(null);
	}

	public static void close(WebElement element) {
		driver.close();
	}

	public static void quit(WebElement element) {
		driver.quit();
	}

	public static void maximize(WebElement element) {
		driver.manage().window().maximize();
	}

	public static void navi(String value) {
		driver.navigate().to(value);
	}

	public static void navi_1(String value) {
		driver.navigate().back();
	}

	public static void dropdown(WebElement element, String options, String value) {

		Select s = new Select(element);
		if (options.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		}
	

	public static void actionMethod(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.contextClick(Element).build().perform();
	}
   
	public static void actionMethod1(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(Element).build().perform();
}
	
	public static void actionMethod2(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(Element).click().build().perform();
	}
	public static void actionMethod3(WebElement Element, WebElement Element1) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(Element, Element1).build().perform();
	}

	
	public static void frame (WebElement Element) {
		driver.switchTo().frame(0);
		}
	
	public static void frame1 (WebElement Element1) {
		driver.switchTo().parentFrame();
	}
	public static void frame2 (WebElement Element2) {
		driver.switchTo().defaultContent();
}
	public static void robot(WebElement Element) throws AWTException {
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
	
	public static void robot2(WebElement Element2) throws AWTException {
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void windowHandling (WebElement Element) {
		driver.getWindowHandles();
	}
	
	public static void alert (WebElement Element) {
		Alert alc = driver.switchTo().alert();
		alc.accept();
	}
	public static void alert1 (WebElement Element) {
		Alert alc = driver.switchTo().alert();
		alc.dismiss();
	}
	public static void alert2 (WebElement Element,String value) {
		Alert alc = driver.switchTo().alert();
		alc.sendKeys(value);
	}
  public static void enable (WebElement Element) {
	  Element.isEnabled();
	  }
  public static void enable1 (WebElement Element1) {
	  Element1.isDisplayed();
	  }
  public static void enable2 (WebElement Element2) {
	  Element2.isSelected();
	  }
  public static void getoptions (WebElement Element,String value, int options) {
	  Select s = new Select(Element);
	  s.getOptions();
  }
  public static void getfirst (WebElement Element,String value, String options) {
	  Select s = new Select(Element);
	  s.getFirstSelectedOption();
  }
  public static void getall (WebElement Element, String value, String options) {
	  Select s = new Select(Element);
	  s.getAllSelectedOptions();
  }
  
  public static void screenshot (WebElement Element) throws IOException {
	  TakesScreenshot ts =(TakesScreenshot)driver;
	  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	  File destFile = new File (("user.dir")+ "//file.png");
	  FileUtils.copyFile(sourceFile, destFile);
  }
  
  public static void javascript(WebElement Element) {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].ScrollIntoView",Element);
  }
  
  public static void getAttribute(WebElement Element,String Value) {
	Element.getAttribute(Value);
  }
  public static void wait (String Wait, int s) {
	  driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);
  }
  public static void explicitwait (WebElement Element, String Wait, int sec) {
	  WebDriverWait wait = new WebDriverWait(driver,sec);
	  wait.until(ExpectedConditions.visibilityOf(Element));
  }
  public static void fluenttwait(WebElement Element, String fluent, int seconds) {
	  FluentWait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(seconds, TimeUnit.SECONDS);
	}
  public static void multiple(WebElement Element, String Value) {
	  Select s =new Select (Element);
	  s.isMultiple();
  }
  public static void click(WebElement Element) {
	  Element.click();
  }
  public static void text (WebElement Element, String value) {
     Element.getText();
}
  public static void title (WebElement Element, String Value) {
	  driver.getTitle();
  }
  public static void value1 (WebElement Element, String Value) {
	  Select s =new Select (Element);
	  s.selectByValue(Value);
  }
  public static void sendkey(WebElement Element,String value) {
	  Element.sendKeys(value);
	  

  }
}
	
	
	
	
	
	
	
	
	
	
	
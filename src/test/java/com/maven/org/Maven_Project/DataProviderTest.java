
package com.maven.org.Maven_Project;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

public class DataProviderTest {
	@Test(dataProvider = "test")
private void crendentials(String username, String password) {
		System.out.println("username = "+ username   +  "    password = "+ password);
	}
	@DataProvider 
	public Object[][] test () {
		return new Object[][] {{"ram","1234"},
			{"vijay","hyweeirwyt"},
			{"arun","1234657"}
		};
		
	}
}
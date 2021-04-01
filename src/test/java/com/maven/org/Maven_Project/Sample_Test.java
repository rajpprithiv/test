package com.maven.org.Maven_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample_Test {
	@Test(retryAnalyzer = Retryanalyzer.class)
	public void test() {

		Assert.assertEquals("Arun", "arun");
	}

}

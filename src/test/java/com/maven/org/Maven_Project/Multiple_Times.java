package com.maven.org.Maven_Project;

import org.testng.annotations.Test;

public class Multiple_Times {

	private void order() {
System.out.println("order");
	}
private void food() {
System.out.println("food");
}
@Test(invocationCount = 10)
private void deliver() {
System.out.println("deliver");
}
private void payment() {
System.out.println("amount paid");
}

}

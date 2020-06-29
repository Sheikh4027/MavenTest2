package Packagetesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Class3 {
	@Test
	public void WebloginCarLoan() {
		System.out.println("Wenlogincodes");
	}

	@Test
	public void MobileLoginCarLoan() {
		System.out.println("MobileLogin");
	}

	@Test(groups = {"Smoke"})

	public void LoginApiCarLoan() {
		System.out.println("ApiLogin");
	}

	@AfterMethod
	public void after()
	{
		System.out.println("I will print after every methods in class 3");
	}
	
	
	
	
}

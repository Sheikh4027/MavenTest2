package Packagetesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class4 {
	@Test
	public void WebloginHomeLoan() {
		System.out.println("HomeLoanLogincodes");
	}

	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("HomeLoanMobileLogin");
	}

	@Test

	public void LoginApiHomeLoan() {
		System.out.println("HomeLoanApiLogin");
	}
	@BeforeMethod

	public void Login() {
		System.out.println("I will print before all methods in class-4.");
	}
	
	
}

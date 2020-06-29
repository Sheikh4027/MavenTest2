package Packagetesting;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void demo() {
		System.out.println("Hello Tufail");
		
	}

	@Test(groups = {"Smoke"})
	public void secondClass() {
		System.out.println("Hello Prapti Shona");
	}


	@BeforeTest
	public void demo3() {
		System.out.println("Hello hahahahah Tufail");
	}
	

	
	
	@Parameters({"URL", "userName"})                         // feeding multiple data by using parameters.
	@Test
	public void dim(String UrlName, String User) {
		System.out.println("Hello Tufail");
		System.out.println(UrlName);
		System.out.println(User);
	}
	
	
	
	
}

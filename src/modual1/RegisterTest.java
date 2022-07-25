package modual1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {
     
	@BeforeMethod
	public void checkMethod () {
		System.out.println("Checking Method");
	}
	@Test (priority = 0)
	 public void positiveRegister () {
		 System.out.println(" Positive Register Test ");
		 
	 }
	
	@Test (priority = 1)
	 public void negativeRegister () {
		 System.out.println(" Negative Register Test ");
	}	 
	@AfterMethod 
	public void afterMethod () {
				System.out.println("After Method Code");	 
	}
	
}

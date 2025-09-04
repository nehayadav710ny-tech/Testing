package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@Test
	public void testMethod() {
		
		System.out.println("hello Neha");
	}
	

	@Test
	public void testMethod1() {
		
		System.out.println("hello Rahul");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
		
		
		

}

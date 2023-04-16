package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest(alwaysRun=true)
	public void method3()
	{
		System.out.println("Before executing all test cases");
	}
	
	@BeforeMethod
	public void method1()
	{
		System.out.println("Inside Before method");
	}

	@AfterMethod
	public void method2() {
		System.out.println("Inside after method");
	}
	
	@AfterTest(alwaysRun=true)
	public void method4()
	{
		System.out.println("Executing After all testcases at the end");
	}
}

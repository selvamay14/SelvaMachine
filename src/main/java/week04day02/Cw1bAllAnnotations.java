package week04day02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cw1bAllAnnotations {
	
	@BeforeSuite
	public void bSuiteTC()
	{
		System.out.println("Print Before Suite");
	}

	@BeforeTest
	public void bTestTC()
	{
		System.out.println("Print Before Test");
	}

	@BeforeClass
	public void bClassTC()
	{
		System.out.println("Print Before Class");
	}
	
	@BeforeMethod
	public void bMethodTC()
	{
		System.out.println("Print Before Method");
	}
	
	
	@Test
	public void testTC1()
	{
		System.out.println("Print TestTC1");
	}
	
	@Test
	public void testTC2()
	{
		System.out.println("Print TestTC2");
	}
	
	@AfterMethod
	public void aMethodTC()
	{
		System.out.println("Print After Method");
	}
	
	@BeforeClass
	public void aClassTC()
	{
		System.out.println("Print After Class");
	}
	
	
}

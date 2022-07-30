package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample {

	@Test
	void testmethod()
	{
		System.out.println("test Output");
	}
	
	
	@Test
	void testapple()
	{
		System.out.println("apple");
	}
	
	
	
	@Test
	void testsamsung()
	{
		System.out.println("samsung");
	}
	
	
	
	@Test
	void testShiv()
	{
		System.out.println("Shiv");
	}
	
	@BeforeTest
	void before()
	{
		System.out.println("Before");
	}
	
	
	@AfterTest
	void after()
	{
		System.out.println("After");
	}
	
	@AfterClass
	void afterC()
	{
		System.out.println("After C");
	}
	
	@BeforeClass
	void beforeC()
	{
		System.out.println("Before C");
	}
}
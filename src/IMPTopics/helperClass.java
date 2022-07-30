package IMPTopics;

import org.testng.annotations.Test;

public class helperClass {
	
	@Test(dependsOnMethods= {"WebDriver"})
	void openwebpage()
	{
		System.out.println("web page is opened");
	}
	
	@Test(dependsOnMethods= {"openwebpage"})
	void UITesting()
	{
		System.out.println("Selenium Testing");
	}
	
	@Test(description="This method will connect the web Driver to the remote Driver")
	void WebDriver()
	{
		System.out.println("inatial stage");
	}
	
	@Test(groups="testThis")
	void testOneOne()
	{
		System.out.println("one");
	}
	
	@Test(groups="testThis")
	void testTwoTwo()
	{
		System.out.println("two");
	}
	
	@Test(groups="smokeatesting")
	void testThree()
	{
		System.out.println("three");
	}

}

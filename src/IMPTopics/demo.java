package IMPTopics;

import org.testng.annotations.Test;

public class demo {
	@Test(groups="smokeatesting")
	void testOne()
	{
		System.out.println("one");
	}
	
	@Test(groups="testThis")
	void testTwo()
	{
		System.out.println("two");
	}
	
	@Test(groups="testThis")
	void testThree()
	{
		System.out.println("three");
	}


}

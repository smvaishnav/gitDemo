package IMPTopics;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(IMPTopics.listener.class)

public class testCaseClass {
	
	@Test
	void one() 
	{
		System.out.println("1");
		
	}
	
	@Test
	void two() 
	{
	
		int i= 10/0;
		
		System.out.println(i);
		System.out.println("2");
	}
	
	@Test
	void three()  
	{
	
		System.out.println("3");
	}

}

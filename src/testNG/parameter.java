package testNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

	
	@Test
	@Parameters("MyParam")
	void para(String MyName)
	{
		System.out.println(MyName);
	}
}

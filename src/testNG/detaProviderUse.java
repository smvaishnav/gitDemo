package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class detaProviderUse {
	@DataProvider(name="data-provider")
	Object[][] multipleValueMethode()
	{
		return new Object [][] {{"one"},{"two"},{"three"},{"four"}};
	}

	@Test(dataProvider="data-provider")
	void test(String val)
	{
		System.out.println(val);
	}
}

package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0
{
	@Test
	public void demo()
	{
		Reporter.log("hello",true);
		Reporter.log("hi",false);
	}
}

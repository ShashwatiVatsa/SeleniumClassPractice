package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2
{
	@Test(priority=1)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(priority=-1)
	public void status()
	{
		Reporter.log("status",true);
	}
	
	@Test
	public void chats()
	{
		Reporter.log("chats",true);
	}
}

package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4
{
	@Test(priority=1,invocationCount=3)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(enabled=false)
	public void chats()
	{
		Reporter.log("chats",true);
	}
	
	@Test(priority=-1,invocationCount=2)
	public void status()
	{
		Reporter.log("status",false);
	}
}

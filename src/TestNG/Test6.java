package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test6
{
	public WebDriver driver;
	
	@BeforeMethod
	public void opnApp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("(//div[text()='Get Started'])[1]")).click();
		Reporter.log(driver.getCurrentUrl(),true);
		Reporter.log(driver.getTitle(),true);		
	}
	
	@AfterMethod
	public void ClsApp()
	{
		driver.close();
	}
}

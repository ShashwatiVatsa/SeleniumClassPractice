package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test8
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
	public void demo()
	{		
		driver.findElement(By.id("email")).sendKeys("shashwati19@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Kirancharu@098");
		driver.findElement(By.name("login")).click();
		String url=driver.getCurrentUrl();
		Reporter.log(url,true);
		String title=driver.getTitle();
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(title,"Facebook");
		
		Reporter.log(title,true);
		s.assertAll();
	}
		
	@AfterMethod
	public void clsApp()
	{
		driver.close();
	}
}

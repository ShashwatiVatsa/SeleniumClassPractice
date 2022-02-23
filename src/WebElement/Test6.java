package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement loginbtn = driver.findElement(By.id("loginButton"));
		if(loginbtn.isEnabled())
		{
			System.out.println("Pass: element is displayed");
			loginbtn.click();
		}
		driver.close();
	}
}

package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("shashwati19@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Kirancharu@098");
		driver.findElement(By.name("login")).click();

		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("(20+) Facebook"))
		{
			System.out.println("Pass: Homw page is displayed");
		}
		else
		{
			System.out.println("Fail: Home page is not displayed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}

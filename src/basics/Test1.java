package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.close();
	}
}
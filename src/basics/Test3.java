package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("shashwati19@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Kirancharu@098");
		driver.findElement(By.name("login")).click();

		driver.close();
	}

}

package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21JanFlipkartTest1
{
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shashwati19@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Kirancharu@098");

		//using attribute
		//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		//using text
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();

		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("Pass: Home page is open");
		}
		else
		{
			System.out.println("Fail: Home page is not opened");
		}

		driver.close();
	}
}

package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21JanInstagramTest1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("shashwati19@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Kirancharu@0");
		driver.findElement(By.xpath("(//div[contains(@class,'IwRSH      eGOV_')])[4]")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram"))
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
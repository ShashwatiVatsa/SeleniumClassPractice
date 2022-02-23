package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement welcometext = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		WebElement fbtext = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		System.out.println("Height and weidth if Facebook text "+fbtext.getSize());
		System.out.println("Height and weidth if Welcome text "+welcometext.getSize());

		driver.close();
	}

}

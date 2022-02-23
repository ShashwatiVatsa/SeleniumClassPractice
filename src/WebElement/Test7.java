package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		WebElement radiobtn = driver.findElement(By.name("sex"));
		radiobtn.click();
		Thread.sleep(5000);
		if(radiobtn.isSelected())
		{
			System.out.println(radiobtn.isSelected());
			System.out.println("Pass: Radio button is selected");
		}
		else
		{
			System.out.println(radiobtn.isSelected());
			System.out.println("Fail: Radio button is not selected");
		}

		driver.close();
	}
}

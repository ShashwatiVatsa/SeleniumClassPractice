package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement course = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(course).perform();

		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		

		driver.close();
	}
}

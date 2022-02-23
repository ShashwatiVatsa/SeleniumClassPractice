package Chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(women).perform();

		driver.findElement(By.xpath("//a[text()='Shrugs']")).click();

		driver.close();
	}
}

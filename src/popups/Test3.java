package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();

		Set<String> child = driver.getWindowHandles();
		for(String c:child) {
			driver.switchTo().window(c);
		}
		Actions a=new Actions(driver);
		WebElement course=driver.findElement(By.id("course"));
		a.moveToElement(course).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		
		driver.quit();
	}
}

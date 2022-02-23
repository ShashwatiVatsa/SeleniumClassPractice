package Chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test5
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dropdown = driver.findElement(By.name("addresstype"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);

		driver.findElement(By.xpath("(//a[text()='munit testing '])[2]")).click();

		WebElement plus = driver.findElement(By.id("add"));
		Actions a = new Actions(driver);
		a.doubleClick(plus).perform();

		driver.close();
	}
}

package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment31JanSkillrary
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("core java for selenium");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

		driver.findElement(By.xpath("(//img[@id='image-3'])[2]")).click();

		driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();

		driver.close();
	}
}

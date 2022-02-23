package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Point loc = search.getLocation();
		System.out.println(loc.getX()+" X cordinate");
		System.out.println(loc.getY()+" Y cordinates");

		driver.close();
	}
}
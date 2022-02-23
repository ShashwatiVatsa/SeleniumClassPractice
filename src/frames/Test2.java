package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement element = driver.findElement(By.xpath("(//img[@class='wooble'])[4]"));
		Point loc = element.getLocation();
		int x=loc.getX();
		int y=loc.getY();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);

		/*// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();*/

		element.click();

		driver.close();

		/*// Switch to new window opened
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}

		WebElement addtocart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		Point atcloc = addtocart.getLocation();
		int atcx=atcloc.getX();
		int atcy=atcloc.getY();
		js.executeScript("window.scrollBy("+atcx+","+atcy+")");
		addtocart.click();

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

		// Continue with original browser (first window)


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.close();*/
	}
}

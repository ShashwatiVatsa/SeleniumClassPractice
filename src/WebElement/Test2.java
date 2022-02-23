package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(search.getAttribute("type"));
		System.out.println(search.getAttribute("id"));
		System.out.println(search.getAttribute("name"));
		System.out.println(search.getAttribute("autocomplete"));
		System.out.println(search.getAttribute("class"));
		System.out.println(search.getAttribute("dir"));
		System.out.println(search.getAttribute("tabindex"));
		System.out.println(search.getAttribute("aria-label"));

		driver.close();
	}
}

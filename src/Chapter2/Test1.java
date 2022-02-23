package Chapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		s.selectByIndex(11);
		s.selectByValue("search-alias=nowstore");
		s.selectByVisibleText("Clothing & Accessories");

		//print all options
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		for(WebElement alloptions:options)
		{
			System.out.println(alloptions.getText());
		}

		driver.close();
	}
}

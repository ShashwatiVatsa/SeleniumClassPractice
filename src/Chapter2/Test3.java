package Chapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);

		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.selectByIndex(1);
			s.selectByValue("199");
			s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		}

		//print the all options
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		for(WebElement alloptions:options)
		{
			System.out.println(alloptions.getText());
		}

		s.deselectAll();
		driver.close();
	}
}

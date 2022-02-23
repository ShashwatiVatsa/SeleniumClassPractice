package Chapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		s.selectByValue("199");
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");

		//print the selected options
		List<WebElement> selectedoptn = s.getAllSelectedOptions();
		System.out.println(selectedoptn.size());
		for(WebElement alloptions:selectedoptn)
		{
			System.out.println(alloptions.getText());
		}

		//s.deselectAll(); deselect all at one go

		s.deselectByIndex(1);
		s.deselectByValue("199");
		s.deselectByIndex(3);

		driver.close();
	}
}

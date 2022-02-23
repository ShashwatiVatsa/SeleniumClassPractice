package Chapter2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment27JanFBTest
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		WebElement monthdd = driver.findElement(By.id("month"));
		Select s = new Select(monthdd);
		System.out.println(s.isMultiple());

		List<WebElement> monthlist = s.getOptions();
		System.out.println(monthlist.size());
		ArrayList<String> list = new ArrayList<String>();
		for(WebElement alloptions:monthlist)
		{
			String month=alloptions.getText();
			System.out.println(month);
			list.add(month);
		}

		System.out.println("after sorting");
		Collections.sort(list);
		for(Object o:list)
		{
			System.out.println(o);
		}
		driver.close();
	}
}

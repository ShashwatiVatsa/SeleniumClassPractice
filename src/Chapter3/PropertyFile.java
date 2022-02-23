package Chapter3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile
{
	public static void main(String[] args) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./Data.properties");
		p.load(fis);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(p.getProperty("password"));
		
		driver.close();
	}
}

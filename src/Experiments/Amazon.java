package Experiments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions a=new Actions(driver);
		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(signin).perform();
		driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).click();

		driver.findElement(By.id("ap_email")).sendKeys("shashwati19@gmail.com");
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("ap_password")).sendKeys("Kirancharu@0");
		driver.findElement(By.id("signInSubmit")).click();

		driver.findElement(By.id("nav-cart-count")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		driver.findElement(By.xpath("(//a[@class='a-declarative a-button-text '])[1]")).click();
		driver.findElement(By.name("addCreditCardVerificationNumber0")).sendKeys("999");
		driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")).click();
		driver.findElement(By.name("placeYourOrder1")).click();
		Thread.sleep(5000);

		driver.close();
	}
}

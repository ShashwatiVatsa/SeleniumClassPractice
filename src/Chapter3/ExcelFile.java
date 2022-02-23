package Chapter3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFile
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis =new FileInputStream("./Selenium.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		String url=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String username=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.close();
	}
}

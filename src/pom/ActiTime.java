package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime {

	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name = "pwd")
	private WebElement pwd;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public ActiTime(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void usrnam(String user) {
		username.sendKeys(user);
	}
	
	public void password(String passwrd) {
		pwd.sendKeys(passwrd);
	}
	
	public void login() {
		loginButton.click();
	}
}

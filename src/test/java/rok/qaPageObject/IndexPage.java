package rok.qaPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	WebDriver ldriver;
	
	public IndexPage(WebDriver rdriver) {
		ldriver = rdriver;
		  
		PageFactory.initElements(rdriver, this);
	}
	// 2.identify WebElement

	@FindBy(id = "username")
	WebElement username1;
	@FindBy(id = "password")
	WebElement password1;
	@FindBy(id = "Login")
	WebElement login;
	
	
	

	// 3.identify action on webElement

	public void passdata(String usernamecd, String passwordcd) throws InterruptedException {
		username1.sendKeys(usernamecd);
		password1.sendKeys(passwordcd);
		login.click();
		Thread.sleep(4000);

	}
	
}

package rok.qaPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import rok.qa.Utilities.Wrappers;

public class Dashboad_Lead {
	WebDriver ldriver;

	public Dashboad_Lead(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//div[@class='comm-navigation forceCommunityGlobalNavigation']//li//button[contains(text(),'Manage Deals')]")
	WebElement ManageDeals;

//@FindBy(xpath ="//span[.='Manage Opportunities']")
	// WebElement Manageleads;

	@FindBy(xpath = "//span[.='Manage Leads']")
	WebElement Manageleads;

	// 3.identify action on webElement

	public void clickonlead() throws InterruptedException {
		Thread.sleep(5000);
		ManageDeals.click();
		Thread.sleep(4000);

		// Manageleads.click();

//		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
//
//		executor.executeScript("arguments[0].click();", Manageleads);

		Wrappers.clickJS(Manageleads);
	}

}

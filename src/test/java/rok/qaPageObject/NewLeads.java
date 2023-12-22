package rok.qaPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import rok.qa.Utilities.Wrappers;

public class NewLeads {
	WebDriver ldriver;

	public NewLeads(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//*[contains(text(),'Add New Lead')]")
	WebElement AddNewLeads;
	@FindBy(xpath = "//*[contains(text(),'DEAL INFORMATION')]")
	WebElement clickondealinfo;
	@FindBy(xpath = "//*[contains(text(),'Select Lead Source')]")
	WebElement leadsource;
	@FindBy(xpath = "//div[@part='dropdown overlay']//span[contains(text(),'Paid Ads')]")
	WebElement leadsourceDropdownOptions;
	@FindBy(xpath = "//*[@title='COMPANY INFORMATION']")
	WebElement clickoncomp;
	@FindBy(xpath = "//input[@placeholder='Company Name']")
	WebElement compname;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement compemail;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement compfirstname;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement complastname;
	@FindBy(xpath = "//button[@aria-label='Annual Sales:, Annual Sales']")
	WebElement annualsales;
	@FindBy(xpath = "//*[@title='$1,800,000 - $3,000,000']")
	WebElement anualsaleamt;
	@FindBy(xpath = "//div[@class=\"slds-modal__footer\"]//button[contains(text(),'Save')]")
	WebElement clickonsave;

	public void creatnewlead() throws InterruptedException {

		Wrappers.clickJS(AddNewLeads);
		Wrappers.clickJS(clickondealinfo);
		Thread.sleep(4000);
		Wrappers.clickJS(leadsource);
		Wrappers.clickJS(leadsourceDropdownOptions);
		Thread.sleep(4000);
		Wrappers.clickJS(clickoncomp);
		compname.sendKeys("test12pm8dec23");
		compemail.sendKeys("test12pm8dec23@yopmail.com");
		compfirstname.sendKeys("testrok");
		complastname.sendKeys("testfinance");
		Wrappers.clickJS(annualsales);
		Wrappers.clickJS(anualsaleamt);
		Wrappers.clickJS(clickonsave);

	}

}

package rok.qaPageObject;

import java.awt.Robot;

import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.event.KeyEvent;

import rok.qa.Utilities.FileUploadUsingRobot;
import rok.qa.Utilities.Wrappers;

public class UpdateBFlead {
	WebDriver ldriver;
	String filePath1 ="D:\\pdf test3.pdf";

	public UpdateBFlead(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//button[contains(text(),'Manage Deals')]")
	WebElement clickmanageBFlead;
	@FindBy(xpath = "//span[.='Manage Leads']")
	WebElement clickManageleads;
	@FindBy(xpath = "(//a[contains(text(),'View')])[1]")
	WebElement clickManageleadsview;
	@FindBy(xpath = "//*[contains(text(),'Edit Company')]")
	WebElement clickoneditcomp;
	@FindBy(xpath = "(//input[@class=' input'and@type='text'])[4]")
	WebElement Editcopname;
	@FindBy(xpath = "//div[@class=\"uiInput uiInputEmail uiInput--default uiInput--input\"]//input[@inputmode=\"email\"]")
	WebElement Editemail;
	@FindBy(xpath = "//input[@class='firstName compoundBorderBottom form-element__row input']")
	WebElement Editfirstname;
	@FindBy(xpath = "//input[@class='lastName compoundBorderBottom form-element__row input']")
	WebElement Editlastname;	
	@FindBy(xpath = "(//input[@class=\" input\" and @type=\"tel\"])[2]")
	WebElement Editbsphone;	
	@FindBy(xpath = "(//a[@class=\"select\"])[6]")
	WebElement Editannualgross;	
	@FindBy(xpath = "//a[contains(text(),'$120,000 - $360,000')]")
	WebElement Editselectannualgross;	
	@FindBy(xpath = "//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']")
	WebElement Editsave;
	//button[@class="slds-button slds-button--neutral ok desktop uiButton--default uiButton--brand uiButton"]
	@FindBy(xpath = "//button[@class=\"slds-button slds-button--neutral ok desktop uiButton--default uiButton--brand uiButton\"]")
	WebElement Editfilesave;
	//span[@class="slds-file-selector__button slds-button slds-button_neutral" and @part="button"]
	@FindBy(xpath = "//span[@class=\"slds-file-selector__button slds-button slds-button_neutral\" and @part=\"button\"]")
	WebElement uploadfilefromeditlead;
	
	//button[@class="slds-button slds-button--neutral ok desktop uiButton--default uiButton--brand uiButton"]
	@FindBy(xpath = "//span[contains(text(),'Done')]")
	WebElement saved;
	
	//(//div[@class="form-element"])//a[@class="datePicker-openIcon display"]
	@FindBy(xpath = "(//div[@class='form-element'])//a[@class='datePicker-openIcon display']")
	WebElement clickoncalender;
	
	@FindBy(xpath="(//a[@title='Go to previous month' ])//span[contains(text(),'Go to previous month')]")		
	WebElement premonthselect;
	
	//*[@class="monthYear"]
	@FindBy(xpath="//*[@class='monthYear']")		
	WebElement mothselect;
	//select[@class="slds-select picklist__label"]
	@FindBy(xpath="//select[@class='slds-select picklist__label']")		
	WebElement yearselect;
	//span[@class="slds-day weekday todayDate selectedDate DESKTOP uiDayInMonthCell--default"]
	
	@FindBy(xpath="//td[@class='uiDayInMonthCell']/span[contains(text(),'2')]")		
	WebElement dateselect;
//3.create method to operations
	public void updateleadbf() throws Exception {

		Wrappers.clickJS(clickmanageBFlead);
		Thread.sleep(6000);
		Wrappers.clickJS(clickManageleads);
		Thread.sleep(6000);
		Wrappers.clickJS(clickManageleadsview);
		Wrappers.windowhand();
		Thread.sleep(25000);
		Wrappers.uploadfrombottom("window.scrollTo(0, 500)");
		Wrappers.clickJS(clickoneditcomp);
		Thread.sleep(6000);
		Editcopname.clear();
		Editcopname.sendKeys("test123");
		Editemail.clear();
		Editemail.sendKeys("rok@yopmail.com");
		Editfirstname.clear();
		Editfirstname.sendKeys("testrok");
		Editlastname.clear();
		Editlastname.sendKeys("testrrr");
		Editbsphone.clear();
		Editbsphone.sendKeys("1234567898");
    	Wrappers.clickJS(Editannualgross);
    	Wrappers.clickJS(Editselectannualgross);
    	Wrappers.selectcalenderdate();
		Wrappers.clickJS(clickoncalender);
		Wrappers.clickJS(premonthselect);
		//Wrappers.clickJS(yearselect);
		Select selectyrs= new Select(yearselect);
		selectyrs.selectByVisibleText("2023");
		Wrappers.clickJS(dateselect);
		Thread.sleep(25000);
		Wrappers.clickJS(Editsave);
		
		Wrappers.executeScript(null);
		FileUploadUsingRobot obje = new FileUploadUsingRobot();
		 String fileP = "D:\\pdf test3.pdf";
	        obje.robotfileupload(uploadfilefromeditlead, fileP);
	        Thread.sleep(25000);
		Wrappers.clickJS(saved);
		
		System.out.println("Lead updated sucessfully");
		
	}
	


}

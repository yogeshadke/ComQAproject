package rok.qaPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rok.qa.Utilities.Wrappers;

public class UpdateRPlead {
	WebDriver ldriver;

	public UpdateRPlead(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//button[contains(text(),'Manage Partner')]")
	WebElement clickRPtab;
	@FindBy(xpath = "//*[contains(text(),'Manage Partner Leads')]")
	WebElement Rpmanagelead;
	@FindBy(xpath = "//button[contains(text(),'Add Partner')]")
	WebElement clickonleasRP;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement Enterfirstname;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement Enterlastname;
	@FindBy(xpath = "//input[@inputmode='email']")
	WebElement Enteremail;
	@FindBy(xpath = "//input[@placeholder='Business Name']")
	WebElement EnterBsname;
	@FindBy(xpath = "(//input[@type='tel'])[1]")
	WebElement Entermphone;
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement EclickonSave;
	@FindBy(xpath = "//*[contains(text(),'NOTES')]")
	WebElement Eclickonnotes;
	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement Entertitle;
	@FindBy(xpath = "//textarea[@placeholder='Enter a Note']")
	WebElement Enterdscription;
	@FindBy(xpath = "(//a[text()='View'])[1]")
	WebElement clickonview;
	@FindBy(xpath = "//*[contains(text(),'Edit Name')]")
	WebElement clickoneditname;
	//*[@id="input-file-44"]
	@FindBy(xpath = "//span[@class='slds-file-selector__button slds-button slds-button_neutral' and @part='button']")
	WebElement uploadfile;
	@FindBy(xpath = "//button[@class='slds-button slds-button--neutral ok desktop uiButton--default uiButton--brand uiButton']")
	WebElement uploadfileokbtn;
	
	//button[@class="slds-button slds-button--neutral uiButton--brand uiButton forceActionButton"]
	@FindBy(xpath = "//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']")
	WebElement Saveclick;
			

	public void updateleadRPm() throws InterruptedException {

		Wrappers.clickJS(clickRPtab);
		Wrappers.clickJS(Rpmanagelead);
		Thread.sleep(5000);
		Wrappers.clickJS(clickonview);
		Wrappers.windowhand();
		Thread.sleep(15000);
		Wrappers.clickJS(clickoneditname);
		Enterfirstname.sendKeys("rokfn");
		Enterlastname.sendKeys("rokfn");
		Enteremail.clear();
		Enteremail.sendKeys("rokfn@yopmail.com");
		Entermphone.sendKeys("6565656565");
		Wrappers.clickJS(Saveclick);
		Thread.sleep(5000);
		uploadfile.sendKeys("C:\\Users\\yogesh.adke\\Desktop\\logo\\imgonline-com-ua-resize-SqsDug4oQB5.jpg");
		Thread.sleep(5000);
		Wrappers.clickJS(uploadfileokbtn);
		
		
		

	}

}

package rok.qaPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import rok.qa.Utilities.Wrappers;

public class RPLead {

	WebDriver ldriver;

	public RPLead(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//button[contains(text(),'Manage Partner')]")
	WebElement clickRPtab;
	@FindBy(xpath = "//*[contains(text(),'Manage Partner Leads')]")
	WebElement Rpmanagelead;	
	@FindBy(xpath="//button[contains(text(),'Add Partner')]")
	WebElement clickonleasRP;
	//button[@class="section-control slds-button slds-button_reset slds-accordion__summary-action"]
	@FindBy(xpath="//button[@class=\"section-control slds-button slds-button_reset slds-accordion__summary-action\"]")
	WebElement clickonnewRplead;
	
	//input[@placeholder="First Name" and @id="input-405"]
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement Enterfirstname;
	//input[@placeholder="Last Name" and @id="input-408"]
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement Enterlastname;
	//input[@placeholder="Email" and @id="input-411"]
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement Enteremail;
	//input[@placeholder="Business Name" and @id="input-414"]
	@FindBy(xpath="//input[@placeholder='Business Name']")
	WebElement EnterBsname;
	//input[@placeholder="Mobile Phone" and @id="input-417"]
	@FindBy(xpath="//input[@placeholder='Mobile Phone']")
	WebElement Entermphone;
	//button[@aria-label="Lead Source:, Select Lead Source"]
	@FindBy(xpath="//button[@aria-label='Lead Source:, Select Lead Source']")
	WebElement Enteselectsourece;
	//*[contains(text(),'Social Media / YouTube')]
	@FindBy(xpath="//*[contains(text(),'Social Media / YouTube')]")
	WebElement Entersourecesol;
	//button[contains(text(),'Save')]
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement EclickonSave;
	//*[contains(text(),'NOTES')]
	@FindBy(xpath="//*[contains(text(),'NOTES')]")
	WebElement Eclickonnotes;
	//input[@placeholder="Title"]
	@FindBy(xpath="//input[@placeholder='Title']")
	WebElement Entertitle;
	//textarea[@placeholder="Enter a Note"]
	@FindBy(xpath="//textarea[@placeholder='Enter a Note']")
	WebElement Enterdscription;
	// update lead
	@FindBy(linkText="(//a[text()='View'])[1]")
	WebElement clickonview;
	
	
	public void RPleadfromportal() throws InterruptedException {

		//Wrappers.clickJS(cliclonhome);
		Thread.sleep(5000);
		Wrappers.clickJS(clickRPtab);
		Wrappers.clickJS(Rpmanagelead);
		Wrappers.clickJS(clickonleasRP);
		Wrappers.clickJS(clickonnewRplead);
		Enterfirstname.sendKeys("test12pm23dec2q3");
		Enterlastname.sendKeys("rokfs");
		EnterBsname.sendKeys("test123");
		Enteremail.sendKeys("test2343@yopmail.com");
		Entermphone.sendKeys("1212343434");
		Wrappers.clickJS(Enteselectsourece);
		Wrappers.clickJS(Entersourecesol);
		Wrappers.clickJS(Eclickonnotes);
		Entertitle.sendKeys("jobtitle");
		Enterdscription.sendKeys("testdata");
		Wrappers.clickJS(EclickonSave);
		//update lead
		//Wrappers.clickJS(clickonview);
	}

}

package rok.qaPageObject;

import java.time.Duration;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;
import rok.qa.Utilities.Wrappers;

public class Convert_Lead_into_opps {
	public WebDriver ldriver;
	WebDriverWait wait;
	public Convert_Lead_into_opps(WebDriver rdriver) {
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
	
	//td[@data-col-key-value="FirstName-text-4"]
	@FindBy(xpath = "//td[@data-col-key-value='FirstName-text-4']")
	WebElement gettext1;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement sfemail;
	@FindBy(xpath = "//input[@type='password']")
	WebElement sfpassword;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement sfsubit;
	//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']
	@FindBy(xpath = "//input[@type='search' and @placeholder='Search...']")
	WebElement searchop;
	@FindBy(xpath = "//span[contains(text(),'Opportunities')]")
	WebElement clickonopps;	
	@FindBy(xpath = "//button[@aria-label='Search']")
	WebElement clickosrch;
	@FindBy(xpath = "(//input[@class='slds-input' and @part='input'])[2]")
	WebElement oppssearch;	
    @FindBy(xpath = "(//div[@class='instant-results-list']//div[@tabindex='-1'])[2]")
	WebElement selectopt1;

	public void Convertleadtoopps() throws InterruptedException {

		Wrappers.clickJS(clickmanageBFlead);
		Thread.sleep(6000);
		Wrappers.clickJS(clickManageleads);
		String savetext =gettext1.getText();
		System.out.println(savetext);
		ldriver.switchTo().newWindow(WindowType.TAB);
		ldriver.get("https://rok--rokcommqa.sandbox.lightning.force.com/");
		sfemail.sendKeys("testaress12july@yopmail.com");
		sfpassword.sendKeys("Aress123$");
		sfsubit.click();
		Thread.sleep(6000);
       Wrappers.clickJS(clickonopps);
       Thread.sleep(6000);
       Wrappers.clickJS(clickosrch);
       Thread.sleep(4000);
       oppssearch.sendKeys(savetext);
       Thread.sleep(4000);
       Wrappers.clickJS(selectopt1);
      
     
     
    	  //oppssearch.sendKeys(savetext);
      
     
       
       //clickosrch.sendKeys(Keys.ENTER);


       
     
	
	}


}

package rok.qa.Testcases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import rok.qa.Utilities.Read_Configration_From_config_Prop_Folder;
import rok.qaPageObject.IndexPage;

public class BaseClass {

	// Get values from readConfig class in globally
	
	Read_Configration_From_config_Prop_Folder readconfig = new Read_Configration_From_config_Prop_Folder();
	String url = readconfig.getBaseURL();
	String browser = readconfig.getBrowsr();
    String username =readconfig.getusername();
    String password =readconfig.getpassword();
    String SFURL=readconfig.getSFURL();
    String SFusername=readconfig.getSFusername();
    String SFpassword =readconfig.getSFpassword();
    
    
   	public static WebDriver driver;
	public static Logger logger;

	// create before class
	@BeforeClass
	public void setup()

	{
		// Browser switching
		
		switch (browser.toLowerCase())
		

		{
		case "chrome":
			WebDriverManager.chromedriver().clearDriverCache().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		// for login
		logger = LogManager.getLogger("ROK_QA_Project");
		

	}

	@AfterClass
	public void tearDown() {
		// driver.close();
		// driver.quit();

	}

}

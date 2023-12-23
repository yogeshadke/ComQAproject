package rok.qa.Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import rok.qa.Utilities.FileUploadUsingRobot;
import rok.qa.Utilities.Wrappers;
import rok.qaPageObject.IndexPage;
import rok.qaPageObject.UpdateBFlead;
import rok.qaPageObject.UpdateRPlead;

public class Update_BF_lead_testcase_08 extends BaseClass {
	 WebElement uploadfilefromeditlead;
	@Test(priority = 7)
	public void updateleadBF() throws Exception  
	{
		// openUrl
		
		driver.get(url);
		logger.info("Url opened");
		Thread.sleep(5000);
		IndexPage pg =new IndexPage(driver);
		pg.passdata(username,password);
		Thread.sleep(8000);
		UpdateBFlead updateRPleads= new UpdateBFlead(driver);
		updateRPleads.updateleadbf();

//		
		
	}

}

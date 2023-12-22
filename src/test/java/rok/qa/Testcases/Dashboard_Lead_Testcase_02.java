package rok.qa.Testcases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import rok.qaPageObject.Dashboad_Lead;
import rok.qaPageObject.IndexPage;

public class Dashboard_Lead_Testcase_02 extends BaseClass  {
	
	
	@Test(priority=1)
	public void VerfyLead() throws InterruptedException
	{
		//openUrl
		driver.get(url);
		
		logger.info("Url opened");
		IndexPage pg =new IndexPage(driver);
		pg.passdata(username,password);
		Thread.sleep(5000);
		Dashboad_Lead Dl =new Dashboad_Lead(driver);
		Dl.clickonlead();
	
	}
}

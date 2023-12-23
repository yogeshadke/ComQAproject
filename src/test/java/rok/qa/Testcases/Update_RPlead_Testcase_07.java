package rok.qa.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import rok.qaPageObject.IndexPage;
import rok.qaPageObject.RPLead;
import rok.qaPageObject.UpdateRPlead;

public class Update_RPlead_Testcase_07 extends BaseClass {
	@Test(priority = 6)
	public void landingpage() throws InterruptedException {
		// openUrl
		driver.get(url);
		logger.info("Url opened");
		Thread.sleep(5000);
		IndexPage pg =new IndexPage(driver);
		pg.passdata(username,password);
		Thread.sleep(5000);
		UpdateRPlead updateRPleads= new UpdateRPlead(driver);
		updateRPleads.updateleadRPm();
	}
}

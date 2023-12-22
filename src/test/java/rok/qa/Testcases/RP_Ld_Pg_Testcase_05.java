package rok.qa.Testcases;

import org.testng.annotations.Test;

import rok.qaPageObject.IndexPage;
import rok.qaPageObject.LandingPage_Lead;
import rok.qaPageObject.RP_ldpageLead;


public class RP_Ld_Pg_Testcase_05 extends BaseClass {
	@Test(priority = 4)
	public void landingpage() throws InterruptedException {
		// openUrl
		driver.get(url);
		logger.info("Url opened");
		Thread.sleep(5000);
		IndexPage pg =new IndexPage(driver);
		pg.passdata(username,password);
		Thread.sleep(5000);
		RP_ldpageLead ldRP= new RP_ldpageLead(driver);
		ldRP.RPlndlead();
	}

}

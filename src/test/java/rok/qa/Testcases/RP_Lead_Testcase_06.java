package rok.qa.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import rok.qaPageObject.IndexPage;
import rok.qaPageObject.RPLead;
import rok.qaPageObject.RP_ldpageLead;

public class RP_Lead_Testcase_06 extends BaseClass {
	@Test(priority = 5)
	public void landingpage() throws InterruptedException {
		// openUrl
		driver.get(url);
		logger.info("Url opened");
		Thread.sleep(5000);
		IndexPage pg =new IndexPage(driver);
		pg.passdata(username,password);
		Thread.sleep(5000);
		RPLead RPlead= new RPLead(driver);
		Thread.sleep(5000);	
		RPlead.RPleadfromportal();
	}


}

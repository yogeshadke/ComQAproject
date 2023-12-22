package rok.qa.Testcases;

import org.apache.poi.ss.formula.ptg.Ptg;
import org.testng.annotations.Test;

import rok.qaPageObject.Dashboad_Lead;
import rok.qaPageObject.IndexPage;
import rok.qaPageObject.NewLeads;

public class CreateLeads_Testcase_03 extends BaseClass {
	@Test(priority = 2)
	public void VerfyLead() throws InterruptedException {
		// openUrl
		driver.get(url);
		logger.info("Url opened");
		Thread.sleep(5000);
		IndexPage pg =new IndexPage(driver);
		pg.passdata(username,password);
		Dashboad_Lead Dl = new Dashboad_Lead(driver);
		Dl.clickonlead();
		Thread.sleep(5000);
		NewLeads newleads = new NewLeads(driver);
		newleads.creatnewlead();

	}

}

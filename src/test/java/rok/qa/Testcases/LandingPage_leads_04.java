package rok.qa.Testcases;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import rok.qaPageObject.Dashboad_Lead;
import rok.qaPageObject.IndexPage;
import rok.qaPageObject.LandingPage_Lead;
import rok.qaPageObject.NewLeads;

public class LandingPage_leads_04 extends BaseClass {
	@Test(priority = 3)
	public void landingpage() throws InterruptedException {
		// openUrl
		driver.get(url);
		logger.info("Url opened");
		Thread.sleep(5000);
		IndexPage pg =new IndexPage(driver);
		pg.passdata(username,password);
		Thread.sleep(5000);
		LandingPage_Lead ldld= new LandingPage_Lead(driver);
		ldld.landingpageleads();
	}
}

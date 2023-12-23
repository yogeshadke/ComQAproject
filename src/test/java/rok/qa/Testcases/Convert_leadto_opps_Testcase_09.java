package rok.qa.Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import rok.qaPageObject.Convert_Lead_into_opps;
import rok.qaPageObject.IndexPage;
import rok.qaPageObject.UpdateBFlead;

public class Convert_leadto_opps_Testcase_09 extends BaseClass {
	 
		@Test(priority = 8)
		 public void convertleadintoopps() throws Exception {
	        // openUrl
	        driver.get(url);
	        logger.info("Url opened");
	        Thread.sleep(5000);

	        IndexPage pg = new IndexPage(driver);
	        pg.passdata(username, password);
	        Thread.sleep(8000);
	        Convert_Lead_into_opps crt = new Convert_Lead_into_opps(driver);
	        crt.Convertleadtoopps();
	        
	    }
}

package rok.qa.Testcases;


import org.testng.annotations.Test;
import org.testng.annotations.Test;


import rok.qaPageObject.IndexPage;

public class Login_testcase_01 extends BaseClass {
	
	
		
	@Test
	public void VerfyLogin() throws InterruptedException
	{
		//openUrl
		driver.get(url);
	
		logger.info("Url opened");
		
		IndexPage pg =new IndexPage(driver);
		pg.passdata(username,password);
		
		
		

}
}
package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegestration extends BaseClass
{
	@Test(groups= {"Regression","Master"})
	void test_account_regestration() throws InterruptedException
	{ 
		logger.debug("Application Logs");
		logger.info("***Starting TC_001_AccountRegestration ***");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My Account link");
		hp.clickRegister();
		logger.info("Clicked on Register link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing Customer Data");
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setPassword(randomAlphaNumeric());
		regpage.setPrivacyPolicy(); 
		
		/*regpage.setFirstName("ghi");
		regpage.setLastName("jkl");
		regpage.setEmail("jkl12@gmail.com");
		regpage.setPassword("jkl@123");
		regpage.setPrivacyPolicy();
		Thread.sleep(10000);*/
		regpage.clickContinue();
		logger.info("Clicked on Continue button");
		Thread.sleep(10000);
		
		
		String confmsg=regpage.getConfirmationMsg();
		logger.info("Valadating Expected Massage");
		//Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		System.out.println(confmsg);
		
		logger.info("Finished TC_001_AccountRegestration Test");
		
		
		
	}
	
	

}

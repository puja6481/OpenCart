package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"Sanity","Master"})
	public void test_login()
	{
		//try
		//{
		logger.info("*** Starting TC_002_LoginTest ***");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount link");
		hp.clickLogin();
		logger.info("Clicked on Login link");
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Providing Login Details");
		lp.setEmail(rb.getString("email"));
		logger.info("emailid is set");
		lp.setPassword(rb.getString("password"));
		logger.info("Password set");
		lp.clickLogin();
		logger.info("Clicked on login button");
		
	/*	MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		Assert.assertEquals(targetPage, true,"invalid login data");
		}
		catch(Exception e)
		{
			Assert.fail();
		} */
		
		logger.info("*** Finished TC_002_LoginTest *** ");
	}

}

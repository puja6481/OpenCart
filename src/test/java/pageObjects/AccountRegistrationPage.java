package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	public AccountRegistrationPage(WebDriver driver)
	{ 
	   super(driver);
	}
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	
	//Elements on Registration Page
	@FindBy(name="firstname")
	WebElement txtfirstname;
	
	@FindBy(name="lastname")
	WebElement txtlastname;
	
	@FindBy(name="email")
	WebElement txtemail;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="agree")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement btnContinue;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement msgConfirmation;
	
	//Action Methods
	public void setFirstName(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	public void setLastName(String Lname)
	{
		txtlastname.sendKeys(Lname);
	}
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void setPrivacyPolicy()
	{
		
		jse.executeScript("arguments[0].click();",chkdPolicy);
	}
	public void clickContinue()
	{
		
		jse.executeScript("arguments[0].click();",btnContinue);
	}
	public void getpageTitle()
	{
		
	}
	public String getConfirmationMsg()
	{
		try
		{
		return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	

}

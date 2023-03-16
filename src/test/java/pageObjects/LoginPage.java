package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//Elements on login page
	@FindBy(xpath="//input[@id=\"input-email\"]")
	WebElement txtemail;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement btnLogin;
	
	//Action method
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void clickLogin()
	{
		btnLogin.click();
	}

}

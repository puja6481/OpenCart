package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver); //invoke parent class constructor i.e BasePage
	}
	
	//Find Elements
	@FindBy(xpath="//span[text()=\"My Account\"]")
	WebElement linkMyAccount;
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	WebElement linkRegister;
	
	@FindBy(xpath="//a[text()=\"Login\"]")
	WebElement linkLogin;
	
	//Action Methods
	public void clickMyAccount()
	{
		linkMyAccount.click();
	}
	
	public void clickRegister()
	{
		linkRegister.click();
	}
	
	public void clickLogin()
	{
		linkLogin.click();
	}
	

	
}

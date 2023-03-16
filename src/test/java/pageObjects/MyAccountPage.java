package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{

	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//Elements in My Account Pages
	@FindBy(xpath="//*[@id=\"content\"]/h2[1]")
	WebElement msgHeading;
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	//Action Methods
	public boolean isMyAccountPageExists()
	{
		try
		{
			return msgHeading.isDisplayed();
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void clickLogout() 
	{
		lnkLogout.click();

	}

}

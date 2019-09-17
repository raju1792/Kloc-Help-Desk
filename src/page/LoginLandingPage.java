package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import generic.AutoUtil;
import generic.IAutoConst;

public class LoginLandingPage {

	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout_button;
	
	 public LoginLandingPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
		
	public void verifyLoginLandingageIsDisplayed(WebDriver driver,String eTitle) {
	String strETO = AutoUtil.getProperty(IAutoConst.CONFIG_PATH,"ETO");
	long ETO = Long.parseLong(strETO);
	WebDriverWait wait=new WebDriverWait(driver,ETO);
	try{
		//wait.until(ExpectedConditions.urlContains("my_tickets"));
		wait.until(ExpectedConditions.textToBePresentInElement(logout_button, "Logout"));
		String text=logout_button.getText();
		System.out.println(text);
	}
	catch(Exception e) {
		Reporter.log("Welcome Page is not displayed",true);
		Assert.fail();
	}
	
	}
	
	
}

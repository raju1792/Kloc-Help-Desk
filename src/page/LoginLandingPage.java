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

	 public LoginLandingPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
			
	public void verifyLoginLandingageIsDisplayed(WebDriver driver,String eTitle) {
	String strETO = AutoUtil.getProperty(IAutoConst.CONFIG_PATH,"ETO");
	long ETO = Long.parseLong(strETO);
	WebDriverWait wait=new WebDriverWait(driver,ETO);
	try{
		wait.until(ExpectedConditions.urlContains("my_tickets"));
	}
	catch(Exception e) {
		Reporter.log("Welcome Page is not displayed",true);
		Assert.fail();
	}
	
	}
	
	
}

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

public class LoginPage {
@FindBy(xpath="(//input)[1]")
private WebElement un_field;

@FindBy(xpath="//input[@type='password']")
private WebElement pw_field;

@FindBy(xpath="//button[.='Login']")
private WebElement login_button;

@FindBy(xpath="(//span)[2]")
private WebElement un_errormessage;

@FindBy(xpath="(//span)[3]")
private WebElement pw_errormessage;

@FindBy(xpath="//div[2]/div")
private WebElement error_message_for_nonblank;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setUserName(String un) {
	un_field.clear();
	un_field.sendKeys(un);
}

public void setPassword(String pw) {
	pw_field.clear();
	pw_field.sendKeys(pw);
}

public void clickLogin() {
	login_button.click();
}


public void verifyErrorMessageIsDisplayed(String expectedMsg) {
 try{
	 if(un_field.getAttribute("value").length()==0) {
		 String actual_message = un_errormessage.getText(); 
		 Assert.assertEquals(actual_message, expectedMsg);
	 }
	 
	 if(pw_field.getAttribute("value").length()==0) {
		 String actual_message = pw_errormessage.getText();
		 Assert.assertEquals(actual_message, expectedMsg);
	 }
	 
	 if(un_field.getAttribute("value").length()!=0 && pw_field.getAttribute("value").length()!=0) {
			String errormessage=error_message_for_nonblank.getText();
			Assert.assertEquals(errormessage, expectedMsg);	 
	 }
	 
	 /*else {
			String actual_message = un_errormessage.getText();
	 //System.out.println(actual_message);
	 Assert.assertEquals(actual_message, expectedMsg);	 
	 }*/
 }
 catch(Exception e){
	 Reporter.log("No error message is displayed",true);
	 Assert.fail();  
 }
	
}

}

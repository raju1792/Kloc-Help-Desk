package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;

import page.LoginLandingPage;
import page.LoginPage;

public class ValidLoginScenario extends BaseTest {
	
	@Test(priority=1,groups= {"login","smoke"})
	public void testLogin() {

	String un=Excel.getValue(XL_PATH,"Login Scenarios",1,0);
	String pw=Excel.getValue(XL_PATH, "Login Scenarios",1,1);
	String eTitle=Excel.getValue(XL_PATH,"Login Scenarios",1,2);
		
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(un);
	lp.setPassword(pw);
	lp.clickLogin();
		
	LoginLandingPage llp=new LoginLandingPage(driver);
	llp.verifyLoginLandingageIsDisplayed(driver, eTitle);
		
	}

	
}

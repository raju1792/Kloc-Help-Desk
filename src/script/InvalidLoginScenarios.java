package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginLandingPage;
import page.LoginPage;

public class InvalidLoginScenarios extends BaseTest {

	@Test(priority=1,groups= {"login","smoke"})
	public void testinvalidLogin() {
		int rc=Excel.getRowCount(XL_PATH, "Invalid Login Scenarios");
		for(int i=1;i<=rc;i++) {
			String un=Excel.getValue(XL_PATH,"Invalid Login Scenarios",1,0);
			String pw=Excel.getValue(XL_PATH, "Invalid Login Scenarios",1,1);
			String eTitle=Excel.getValue(XL_PATH,"Invalid Login Scenarios",1,2);
			
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(un);
			lp.setPassword(pw);
			lp.clickLogin();
			lp.verifyErrorMessageIsDisplayed();
		}	
		
	}
}

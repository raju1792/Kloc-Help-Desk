package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginLandingPage;
import page.LoginPage;

public class InvalidLoginScenarios extends BaseTest {

	
	
	@Test(priority=1,groups= {"login","smoke"})
	public void testinvalidLogin() {
		String un=Excel.getValue(XL_PATH,"Invalid Login Scenarios",1,0);
	String pw=Excel.getValue(XL_PATH, "Invalid Login Scenarios",1,1);
	String eTitle=Excel.getValue(XL_PATH,"Invalid Login Scenarios",1,2);
		
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(un);
	lp.setPassword(pw);
	lp.clickLogin();
	lp.verifyErrorMessageIsDisplayed(eTitle);
			
		}	
		
		
		@Test(priority=2,groups= {"login","smoke"})
		public void testinvalidLogin2() {
			
			int rc=Excel.getRowCount(XL_PATH, "Invalid Scenarios 2");
			System.out.println(rc);
			
			for(int i=0;i<=rc;i++) {
				String un=Excel.getValue(XL_PATH,"Invalid Scenarios 2",i,0);
				//System.out.println(un);
				String pw=Excel.getValue(XL_PATH, "Invalid Scenarios 2",i,1);
				//System.out.println(pw);
				String eTitle=Excel.getValue(XL_PATH,"Invalid Scenarios 2",i,2);
				System.out.println(eTitle);
				
				LoginPage lp=new LoginPage(driver);
				lp.setUserName(un);
				lp.setPassword(pw);
				lp.clickLogin();
				lp.verifyErrorMessageIsDisplayed(eTitle);
			}	
		}
}

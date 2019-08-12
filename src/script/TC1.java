package script;

import generic.BaseTest;
import page.HomePage;

public class TC1 extends BaseTest {

	@org.testng.annotations.Test
	public void tc1() {
		HomePage p=new HomePage(driver);
		p.clickSandals();
	}
	
}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="(//a/span[.='SANDALS'])[1]")
private WebElement sandals;


public HomePage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

 public void clickSandals() {
	 sandals.click();
	 System.out.println("pass");
}
}

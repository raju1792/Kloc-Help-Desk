package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="(//input)[1]")
private WebElement un_field;

@FindBy(xpath="//input[@type='password']")
private WebElement pw_field;

@FindBy(xpath="//button[.='Login']")
private WebElement login_button;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

public void setUserName(String un) {
	un_field.sendKeys(un);
}

public void setPassword(String pw) {
	pw_field.sendKeys(pw);
}

public void clickLogin() {
	login_button.click();
}

}

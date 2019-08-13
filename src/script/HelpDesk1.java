package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelpDesk1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.get("http://helpdesk.klocapps.com/");
	driver.manage().window().maximize();
	/*SIGNUP*/
	/*driver.findElement(By.linkText("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Signup")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("Test");
	driver.findElement(By.xpath("(//input)[2]")).sendKeys("abc");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("Test1234");
	driver.findElement(By.xpath("(//input)[5]")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Signup']")).click();
	Thread.sleep(3000);
	driver.quit();*/
	/*SIGNUP*/
	
	/*LOGIN*/
	/*driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Login']")).click();*/
	/*LOGIN*/
	
	
	/*LOGIN & LOGOUT*/
	/*driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Logout']")).click();
	driver.quit();*/
	/*LOGIN & LOGOUT*/
	
	/*LOGIN & Click Issue Ticket*/
	/*driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	driver.findElement(By.xpath("//a[.='Issue Ticket']")).click();
	driver.findElement(By.xpath("//a[.='COD MADE SIMPLE']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Subject *']")).sendKeys("testingabcde");
	driver.findElement(By.xpath("//textarea[@placeholder='Description *']")).sendKeys("testing my script");
	driver.findElement(By.xpath("//input[@placeholder='Recipients - Optional']")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	WebElement w=driver.findElement(By.xpath("//input[@type='file']"));
	w.sendKeys("C:\\984475.jpg");
	driver.findElement(By.xpath("//button[.='Generate']")).click();*/
	//Cannot verify captcha through script
	/*LOGIN & Click Issue Ticket*/
	
	
	/*LOGIN >>> click on HELP >>> click on Getting Started >>> click on Ticket Generation >>> click on Report Issues*/
		/*driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	driver.findElement(By.linkText("Help")).click();
	driver.findElement(By.linkText("Getting Started")).click();
		driver.findElement(By.linkText("What is KLoc Helpdesk ?")).click();
		driver.findElement(By.linkText("Creating a first account")).click();
		driver.findElement(By.linkText("Displaying content on the storefront")).click();
		driver.findElement(By.linkText("Development")).click();
		driver.findElement(By.linkText("Troubleshooting")).click();
		driver.findElement(By.linkText("Developer Documentation")).click();
		System.out.println("click test");
	System.out.println("clicked once");
	driver.findElement(By.linkText("Ticket Generation")).click();
	System.out.println("clicked twice");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Report Issues")).click();
	System.out.println("clicked thrice");
	Thread.sleep(2000);
	driver.quit();*/
	
	
	/* MANAGE PROFILE >>> CLICK CANCEL */
	
	/*driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	driver.findElement(By.linkText("Manage Profile")).click();
	driver.findElement(By.xpath("//button[.='Edit']")).click();
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='Update Details']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='rodal-close']")).click();*/
	
		
	/* MANAGE PROFILE >>> ENTER VALID 10 DIGIT MOBILE NUMBER >>> CLICK OK */
	
	/*driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	driver.findElement(By.linkText("Manage Profile")).click();
	driver.findElement(By.xpath("//button[.='Edit']")).click();
	
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='Update Details']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='OK']")).click();*/
	
	
	/* MANAGE PROFILE >>>Change password >>> Save Changes */
	/*driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	driver.findElement(By.linkText("Manage Profile")).click();
	driver.findElement(By.xpath("//button[.='Edit']")).click();
	driver.findElement(By.xpath("//button[.='Change password']")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("Test1234");
	driver.findElement(By.xpath("(//input)[2]")).sendKeys("Testabcd");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("Testabcd");
	driver.findElement(By.xpath("//button[.='Save Changes']")).click();
	driver.findElement(By.xpath("//button[.='OK']")).click();
	Thread.sleep(1000);*/	
	/* MANAGE PROFILE >>>Change password >>> Save Changes */
	
	/* MANAGE PROFILE >>>Change password >>> click Cancel */
	/*driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	driver.findElement(By.linkText("Manage Profile")).click();
	driver.findElement(By.xpath("//button[.='Edit']")).click();
	driver.findElement(By.xpath("//button[.='Change password']")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("Test1234");
	driver.findElement(By.xpath("(//input)[2]")).sendKeys("Testabcd");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("Testabcd");
	Thread.sleep(1000);
	System.out.println("click Cancel");
	driver.findElement(By.xpath("//button[.='Cancel']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='OK']")).click();
	System.out.println("closing browser");
	driver.quit();*/
	/* MANAGE PROFILE >>>Change password >>> click Cancel */
	
	/* Clearing EXisting Mobile Number & Updating it*/
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajavardhan.reddy@kloctechnologies.co.in");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	driver.findElement(By.linkText("Manage Profile")).click();
	driver.findElement(By.xpath("//button[.='Edit']")).click();
	WebElement mob_field = driver.findElement(By.xpath("(//input)[3]"));
	String existing_mob_number = mob_field.getAttribute("value");
	System.out.println("Existing Mobile Numnber: "+existing_mob_number);
	/* mob_field.clear(); */
	Thread.sleep(1000);
	mob_field.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
	mob_field.sendKeys("1234567890");
	String updated_mob_number = mob_field.getAttribute("value");
	System.out.println("Updated Mobile Number: "+updated_mob_number);
	driver.findElement(By.xpath("//button[.='Update Details']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='OK']")).click();
	driver.close();
	/* Clearing EXisting Mobile Number & Updating it*/	
 }
}

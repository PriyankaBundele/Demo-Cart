package PageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By Clkloginbtn=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']");
	private By EnterEmailAdd=By.xpath("//input[@id='input-email']");
	private By AddPassforlogin=By.xpath("//input[@name='password']");
	private By clickoncontinue=By.xpath("//input[@class='btn btn-primary']");
	private By Warnigmessg=By.xpath("//div[@class='alert alert-danger alert-dismissible']");


	
	

	public LoginPageObject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement Clickbutt() {
		return driver.findElement(Clkloginbtn);
		
	}
	public WebElement EntrEmailId() {
		return driver.findElement(EnterEmailAdd);
		
	}
	public WebElement AddPasswd() {
		return driver.findElement(AddPassforlogin);
		
	}
	public WebElement ClickContiue() {
		return driver.findElement(clickoncontinue);
		
	}
	public WebElement Warnigmessg() {
		return driver.findElement(Warnigmessg);
		
	}


}

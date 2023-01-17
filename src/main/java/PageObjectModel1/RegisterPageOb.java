package PageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageOb {

	public WebDriver driver;

	private By ClickonAcc = By.xpath("//i[@class='fa fa-user']");
	private By ClickRgister = By
			.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/register']");

	private By ClickFN=By.xpath("//input[@name='firstname']");
	private By LastName=By.xpath("//input[@id='input-lastname']");
	private By EmailEnter=By.xpath("//input[@id='input-email']");
	private By TelephoneClik=By.xpath("//input[@id='input-telephone']");
	private By EnterPwd=By.xpath("//input[@id='input-password']");
	private By ConfirmPwd=By.xpath("//input[@name='confirm']");
	private By Radio=By.xpath("//input[@name='confirm']");
	private By CheckBoxselectoin=By.xpath("//input[@name='agree']");


	
	
	public RegisterPageOb(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement ClickonAcc() {
		return driver.findElement(ClickonAcc);

	}

	public WebElement ClickRegist() {
		return driver.findElement(ClickRgister);

	}
	public WebElement ClikN() {
		return driver.findElement(ClickFN);

	}
	public WebElement ClikLN() {
		return driver.findElement(LastName);

	}
	public WebElement ClikEmail() {
		return driver.findElement(EmailEnter);

	}
	public WebElement ClikTelphoe() {
		return driver.findElement(TelephoneClik);

	}
	public WebElement SetPwd() {
		return driver.findElement(EnterPwd);

	}
	public WebElement SetCfmPw() {
		return driver.findElement(ConfirmPwd);

	}
	public WebElement Radioselect() {
		return driver.findElement(Radio);

	}
	public WebElement CheckBox() {
		return driver.findElement(CheckBoxselectoin);

	}


}

package PageObjectModel1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPageObject {

	public WebDriver driver;

	private By AboutUs = By.xpath(
			"//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=4']");
	private By DeliveryInfo = By.xpath(
			"//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=6']");
	private By PrivacyPage = By.xpath(
			"//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=3']");
	private By TermsandCondition = By.xpath(
			" 	//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=5']");
	private By ReturnsClick = By.xpath("//a[contains(text(),'Returns')]");
	private By ReturnsTeleph = By.xpath("//input[@id='input-telephone']");
	private By orderId = By.xpath("//input[@id='input-order-id']");
	private By SelectCalender = By.xpath("//button[@class='btn btn-default']");
	private By NextMonthclick=By.xpath("(//th[@class='next'])[1]");
	private By Monthandyear=By.xpath("(//th[@class='picker-switch'])[1]");
	private By datesSelect=By.xpath("//td[@class='day']");
	
	private By Cliyesforreturn = By.xpath("(//input[@type='radio'])[6]");
	
	private By returnenquiry = By.xpath("//textarea[@placeholder='Faulty or other details']");
	private By ClicSubmitReturn = By.xpath("//input[@value='Submit']");
	private By ClicksiteMap=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/sitemap']");
	private By Clickon_Brands=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/manufacturer']");
	private By Click_on_Gift_Sertificate=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/voucher']");
	private By Click_on_Afiliate=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=affiliate/login']");
	
	public WebElement AboutUs() {

		return driver.findElement(AboutUs);
	}

	public WebElement DeliveryInfo1() {

		return driver.findElement(DeliveryInfo);
	}

	public WebElement PrivacyPagefooter() {

		return driver.findElement(PrivacyPage);
	}

	public WebElement Termandcondi() {

		return driver.findElement(TermsandCondition);
	}

	public WebElement ReturnsClick1() {

		return driver.findElement(ReturnsClick);
	}

	public WebElement ReturnsTeleph() {

		return driver.findElement(ReturnsTeleph);
	}

	public WebElement orderId() {

		return driver.findElement(orderId);
	}

	public WebElement SelectCalender() {

		return driver.findElement(SelectCalender);
	}
	public WebElement NextMonthclick1() {

		return driver.findElement(NextMonthclick);
	}
	public WebElement Monthandyear() {

		return driver.findElement(Monthandyear);
	}
	public List <WebElement> datesSelect() {

		return driver.findElements(datesSelect);
	}
	

	public WebElement Cliyesforreturn() {

		return driver.findElement(Cliyesforreturn);
	}

	public WebElement returnenquiry() {

		return driver.findElement(returnenquiry);
	}

	public WebElement ClicSubmitReturn() {

		return driver.findElement(ClicSubmitReturn);
	}
	public WebElement ClicksiteMap() {

		return driver.findElement(ClicksiteMap);
	}
	
	public WebElement Clickon_Brands () {
		  
		 return driver.findElement(Clickon_Brands);
	}
	
	public WebElement Click_on_Gift_Sertificate() {
		  
		 return driver.findElement(Click_on_Gift_Sertificate);
	}
	
	
	public WebElement Click_on_Afiliate() {
		  
		 return driver.findElement(Click_on_Afiliate);
	}
	
	
	

	public FooterPageObject(WebDriver driver2) {
		this.driver = driver2;

	}
}

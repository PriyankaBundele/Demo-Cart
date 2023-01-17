package PageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCartPageObject {
	public WebDriver driver;

	private By Search = By.xpath("//input[@name='search']");
	private By HitSearch = By.xpath("//button[@class='btn btn-default btn-lg']");
	private By PriceOfitem = By.xpath("//p[@class='price']");
	private By Addtoiphonecart = By.xpath("//div[@class='button-group']/button[1]");
	private By XPathofsamsung = By.xpath("(//p[@class='price'])[2]");
	private By Samsungaddtocart=By.xpath("(//div[@class='button-group'])[2][1]/button[1]");
	private By ClickOnCart = By.xpath("(//button[@data-toggle='dropdown'])[2]");
	private By TotalXpth = By.xpath("(//td[@class='text-right'])[12]");



	public AddCartPageObject(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement Searchbtn() {
		return driver.findElement(Search);
	}

	public WebElement HitSrchbutton() {
		return driver.findElement(HitSearch);
	}

	public WebElement PriceIphone() {
		return driver.findElement(PriceOfitem);
	}

	public WebElement addtocartiphone1() {
		return driver.findElement(Addtoiphonecart);
	}

	public WebElement Samsungaddtocart() {
		return driver.findElement(Samsungaddtocart);
	}
	public WebElement XPathofsamsung() {
		return driver.findElement(XPathofsamsung);
	}
	public WebElement ClickOnCart() {
		return driver.findElement(ClickOnCart);
	}
	public WebElement TotalXpth() {
		return driver.findElement(TotalXpth);
	}

}

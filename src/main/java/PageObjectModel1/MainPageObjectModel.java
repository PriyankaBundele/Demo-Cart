package PageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObjectModel {
	public WebDriver driver;
	private By SelectCurrcy = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	private By SelectUSD = By.xpath("(//button[@class='currency-select btn btn-link btn-block'])[3]");
	private By Contacts = By.xpath("//i[@class='fa fa-phone']");
	private By ContactUsertext = By.xpath("//input[@id='input-name']");
	private By ShoppingCart = By.xpath("//i[@class='fa fa-shopping-cart']");
	private By Checkout = By.xpath("//i[@class='fa fa-share']");
	private By DesktopMHover = By.xpath("(//a[@class='dropdown-toggle'])[2]");
	private By Pc = By.xpath("//a[contains(text(),'PC')]");
	private By MacClick = By.xpath("//a[contains(text(),'Mac')]");
	private By Continue = By.xpath("//a[@class='btn btn-primary']");
	private By SelectMacOpt = By.xpath("//select[@id='input-sort']");
	private By ShowbyId = By.xpath("//select[@id='input-limit']");
	private By iMacImg = By.xpath("//img[@title='iMac']");
	private By ClickWishlist = By.xpath("//i[@class='fa fa-heart']");
	private By ClickLA = By.xpath("(//a[@class='dropdown-toggle'])[3]");
	private By ClickLaptopMac1 = By.xpath("//a[contains(text(),'Macs')]");
	private By ClickWindow = By.xpath("//a[contains(text(),'Windows')]");
	private By Component = By.xpath("//a[contains(text(),'Components')]");
	private By ClickMoni = By.xpath("//a[contains(text(),'Monitors (2)')]");
	private By MonitorsText = By.xpath("//h2[contains(text(),'Monitors')]");
	private By ClickTest = By.xpath("//a[contains(text(),'test 1 (0)')]");
	private By TextClcik = By.xpath("//a[contains(text(),'Continue')]");
	private By Select = By.xpath("//h2[contains(text(),'Monitors')]");
	private By clickonCamera = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33']");
	private By ClickMp3Players = By.xpath("(//a[@data-toggle='dropdown'])[5]");
	private By HomebuttnforBack = By.xpath("//img[@title='naveenopencart']");


	public MainPageObjectModel(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement SelectCurrcy() {

		return driver.findElement(SelectCurrcy);
	}

	public WebElement SelectUSD() {

		return driver.findElement(SelectUSD);
	}

	public WebElement Contacts() {

		return driver.findElement(Contacts);
	}

	public WebElement ContactUsertext() {

		return driver.findElement(ContactUsertext);
	}

	public WebElement ShoppingCart() {

		return driver.findElement(ShoppingCart);
	}

	public WebElement Checkout() {

		return driver.findElement(Checkout);
	}

	public WebElement DesktopHover() {

		return driver.findElement(DesktopMHover);
	}

	public WebElement PCclick() {

		return driver.findElement(Pc);
	}

	public WebElement ContnBttn() {

		return driver.findElement(Continue);
	}

	public WebElement MacClick() {
		return driver.findElement(MacClick);
	}

	public WebElement SelectOption() {
		return driver.findElement(SelectMacOpt);
	}

	public WebElement SelectById1() {
		return driver.findElement(ShowbyId);
	}

	public WebElement ClickOniMac() {
		return driver.findElement(iMacImg);
	}

	public WebElement Towishlist() {
		return driver.findElement(ClickWishlist);
	}

	public WebElement ClickLaptops() {
		return driver.findElement(ClickLA);
	}

	public WebElement ClickLaptopMac() {
		return driver.findElement(ClickLaptopMac1);
	}

	public WebElement Window() {
		return driver.findElement(ClickWindow);
	}

	public WebElement componentclick() {
		return driver.findElement(Component);
	}

	public WebElement ClickMoni() {
		return driver.findElement(ClickMoni);
	}

	public WebElement GetTextmoni() {
		return driver.findElement(MonitorsText);
	}

	public WebElement GetTest1() {
		return driver.findElement(ClickTest);
	}

	public WebElement Conti() {
		return driver.findElement(TextClcik);
	}

	public WebElement clickonCamera() {
		return driver.findElement(clickonCamera);
	}

	public WebElement ClickMp3Players() {
		return driver.findElement(ClickMp3Players);
	}
	public WebElement HomebuttnforBack1() {
		return driver.findElement(HomebuttnforBack);
	}

}

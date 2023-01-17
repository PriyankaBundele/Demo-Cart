package NewResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	public WebDriver driver;

	/*
	 * public static void ActionsMethod() { Actions ac = new Actions(driver);
	 * WebElement a = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
	 * 
	 * }
	 */
	public static void SortDropDown(WebElement WebElement, int Index) {

		Select sel = new Select(WebElement);
		sel.selectByIndex(Index);

	}

	public static void Actions(WebElement WebElements, WebDriver driver) {
	

	
		Actions ac = new Actions(driver);
		ac.moveToElement(WebElements).perform();
	}
	
	public static void SoftAssert(String actual, String expected) {
		
		SoftAssert assertion=new SoftAssert();

		String actual1 =actual;
		String expected1 =expected;
	    assertion.assertEquals(actual1, expected1);
	    assertion.assertAll();
	}
	

}
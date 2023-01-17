package AllTestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import NewResources.BaseClass;
import NewResources.CommonMethods;
import NewResources.Constants;
import PageObjectModel1.MainPageObjectModel;

public class MainPageTestcases extends BaseClass {
	@Test
	public void MainPage() throws IOException, InterruptedException {
		
		
		MainPageObjectModel wi = new MainPageObjectModel(driver);

		wi.SelectCurrcy().click();
		wi.SelectUSD().click();
		wi.Contacts().click();
		wi.ContactUsertext().sendKeys(Constants.ContactUT);
		wi.ShoppingCart().click();
		wi.Checkout().click();

		CommonMethods.Actions(wi.DesktopHover(), driver);
		wi.PCclick().click();
		wi.ContnBttn().click();

		CommonMethods.Actions(wi.DesktopHover(), driver);
		wi.MacClick().click();

		CommonMethods.SortDropDown(wi.SelectOption(), 5);
		CommonMethods.SortDropDown(wi.SelectById1(), 3);
		wi.ClickOniMac().click();
		wi.Towishlist().click();

		driver.navigate().back();
		driver.navigate().back();

		CommonMethods.Actions(wi.ClickLaptops(), driver);
		wi.ClickLaptopMac().click();
		Thread.sleep(3000);
		driver.navigate().back();
		CommonMethods.Actions(wi.ClickLaptops(), driver);
		wi.Window().click();
		driver.navigate().back();
		CommonMethods.Actions(wi.componentclick(), driver);
		wi.ClickMoni().click();
		
		System.out.println(wi.GetTextmoni().getText());
		
	/*	SoftAssert assertion=new SoftAssert();
		String actual="monitor";
		String expected= wi.GetTextmoni().getText();
		assertion.assertEquals(actual, expected);
		assertion.assertAll();*/
		

		wi.GetTest1().click();
		wi.Conti().click();
		wi.clickonCamera().click();
		wi.ClickMp3Players().click();

	}

}

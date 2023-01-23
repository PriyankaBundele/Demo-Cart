package AllTestCase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import NewResources.BaseClass;
import NewResources.Constants;
import PageObjectModel1.FooterPageObject;

public class FooterTestCases extends BaseClass {
	@Test
	public void FooterPage() throws IOException {
		
		
		FooterPageObject vip = new FooterPageObject(driver);
		vip.AboutUs().click(); // Information
		vip.DeliveryInfo1().click();
		vip.PrivacyPagefooter().click();
		vip.Termandcondi().click();

		vip.ReturnsClick1().click(); // Customer Service
		vip.ReturnsTeleph().sendKeys(Constants.Telephone);
		vip.orderId().sendKeys(Constants.MentionORderid);
		vip.SelectCalender().click();

		
		  String month=""; 
		  
		  while(!(month.equals(Constants.MonthandYear))) {
		  vip.NextMonthclick1().click(); 
		  
		  month=vip.Monthandyear().getText(); 
		  }
		  vip.datesSelect();
		
		  try {
		  for(WebElement k:vip.datesSelect()) {
			  if(k.getText().equals("1"));
			  k.click();
			  break;
			  
		  }
		
		  }
		  catch(StaleElementReferenceException e) {
			System.out.println("stale element exception");
		 }
		 

	    vip.Cliyesforreturn().click();

		List<WebElement> a = driver.findElements(By.xpath("//input[@type='radio']"));
		for (int i = 0; i < a.size(); i++) {

			a.get(2).click();
		}
		vip.Cliyesforreturn().click();
		vip.returnenquiry().sendKeys(Constants.enquiry);
		vip.ClicSubmitReturn().click();
		vip.ClicksiteMap().click();
		vip.Clickon_Brands().click();
		vip.Click_on_Gift_Sertificate().click();
		vip.Click_on_Afiliate().click();

	}

}

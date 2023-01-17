package AllTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import NewResources.BaseClass;
import NewResources.CommonMethods;
import NewResources.Constants;
import PageObjectModel1.LoginPageObject;
import PageObjectModel1.RegisterPageOb;

public class LoginTestcases extends BaseClass {
	@Test
	public void LoginTesting() throws IOException {
		

		RegisterPageOb rg = new RegisterPageOb(driver);
		rg.ClickonAcc().click();

		LoginPageObject log = new LoginPageObject(driver);

		log.Clickbutt().click();
		log.EntrEmailId().sendKeys(Constants.EmailAdd);
		log.AddPasswd().sendKeys(Constants.LoginPwd);
		log.ClickContiue().click();
		System.out.println(log.Warnigmessg().getText());
		CommonMethods.SoftAssert(log.Warnigmessg().getText(), Constants.warningMessage);		
		
		
		
	}
}

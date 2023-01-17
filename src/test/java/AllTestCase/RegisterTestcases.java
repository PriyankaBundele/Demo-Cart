package AllTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import NewResources.BaseClass;
import NewResources.Constants;
import PageObjectModel1.RegisterPageOb;

public class RegisterTestcases extends BaseClass {
	@Test
	public void RegisterPage() throws IOException {

		
		driver.manage().window().maximize();
		RegisterPageOb rg = new RegisterPageOb(driver);
		rg.ClickonAcc().click();
		rg.ClickRegist().click();

		rg.ClikN().sendKeys(Constants.name);
		rg.ClikLN().sendKeys(Constants.LtName);
		rg.ClikEmail().sendKeys(Constants.Email);
		rg.ClikTelphoe().sendKeys(Constants.Telephone);
		rg.SetPwd().sendKeys(Constants.Password);
		rg.SetCfmPw().sendKeys(Constants.ConfirmPw);
		rg.Radioselect().click();
		rg.CheckBox().click();
		
	}

}

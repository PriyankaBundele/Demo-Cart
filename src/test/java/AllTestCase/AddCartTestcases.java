 package AllTestCase;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

import NewResources.BaseClass;
import NewResources.Constants;
import PageObjectModel1.AddCartPageObject;

public class AddCartTestcases extends BaseClass {

	@Test
	public void iphoneCart() throws IOException, InterruptedException {

		

		AddCartPageObject obj = new AddCartPageObject(driver);

		obj.Searchbtn().sendKeys(Constants.iphone);
		obj.HitSrchbutton().click();

		System.out.println(obj.PriceIphone().getText());
		String d = obj.PriceIphone().getText();
		String[] c = d.split("\\s");

		String b = c[0];
		String y = b.replace("$", "");
		System.out.println(y);
		double w = Double.parseDouble(y);

		obj.addtocartiphone1().click();

		obj.Searchbtn().clear();
		obj.Searchbtn().sendKeys(Constants.Samsung);
		obj.HitSrchbutton().click();

		System.out.println(obj.XPathofsamsung().getText());
		String go = obj.XPathofsamsung().getText();
		String[] we = go.split("\\s+");
		System.out.println(Arrays.toString(we));
		String yo = we[0];
		String so = yo.replace("$", "");
		System.out.println(so);
		double pp = Double.parseDouble(so);
		obj.Samsungaddtocart().click();
		Thread.sleep(3000);

		obj.ClickOnCart().click();

		double ty = w + pp;
		String n = "$" + ty;
		System.out.println(n);

		String low = obj.TotalXpth().getText();
		System.out.println(low);

		if (n.equals(low)) {
			System.out.println(Constants.addcartRadiopass);
		} else {
			System.out.println(Constants.addcartRadiofail);

		}

	}
}
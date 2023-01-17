package NewResources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;

	public void browserInitialization() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\PRIYANKA\\eclipse-workspace\\DemoCartPractice\\src\\main\\java\\NewResources\\data.properties");
		Properties rsc = new Properties();
		rsc.load(fis);
		String StoreBrowser = rsc.getProperty("browser");
		if (StoreBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (StoreBrowser.equalsIgnoreCase("FirefoxDriver")) {
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Hello");

		}
	}

	@BeforeMethod()
	public void BrowserOpen() throws IOException {

		browserInitialization();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	}
}

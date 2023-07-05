package base_Url;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Lunching_Url {

	public static Properties properties;
	public static WebDriver driver;

	@BeforeMethod
	public void properities() throws Exception {

		FileInputStream file = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(file);

		String browser = properties.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(properties.getProperty("url"));

		String title = driver.getTitle();
		System.out.println(title);
		String expectedTitle = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		if (title.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Expected url");
		} else {
			System.out.println("Expected url is not working.");

		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	//@AfterMethod
	//public void Team_Close() {
	//	driver.quit();
	//}

}

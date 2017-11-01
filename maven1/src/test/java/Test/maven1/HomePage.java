package Test.maven1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;
	@BeforeMethod
	void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rajgit\\Chrome Drivers\\chromedriver.exe");
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
	}
	@Test
	void openFlipkart()
	{
		driver.navigate().to("http://www/flipkart.com");
		System.out.println("Flipkart window opened successfully...");
	}
}

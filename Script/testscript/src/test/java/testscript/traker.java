package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class traker {


	WebDriver driver = null;

   @BeforeTest
	public void setup_test()
	{
		WebDriverManager.chromedriver().setup();

		driver	= new ChromeDriver();

	}
	@Test(priority = 0)
	public void open_traker()
	{
		driver.get("https://apps.powerapps.com/play/e/default-ca4cd827-4fc0-4217-9f0d-2248471ab80f/a/6aa103b9-b4c0-4df0-ae58-b9766e2f5843?tenantId=ca4cd827-4fc0-4217-9f0d-2248471ab80f&source=AppSharedV3&hint=de1dc80c-4857-48e1-a924-7b9f92a748f1&sourcetime=1701337879375");
	}
}

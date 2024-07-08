package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class testNGdemo {

	WebDriver driver = null;
	
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup_test()
	{
		WebDriverManager.chromedriver().setup();
		
	 driver	= new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	
	public void opev_jc()
	{
		driver.get("https://jiocinema.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).sendKeys("RCB");
		driver.findElement(By.xpath("(//div[@class='mui-style-1v5keco-gradient'])[1]")).click();
		
	}
	
	
	
	@AfterTest // to skip test case (enabled = false)
	
	public void end()
	{
		driver.close();
		
	}
	
	
	
	
	
	
	
}

package Sampel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("6361306931");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Madan9731");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	WebElement popupTriger = driver.findElement(By.id("popup-trigger"));
	popupTriger.click();
/*	String mainWindowHandel = driver.getWindowHandle();
	for (String handle : Driver.getWindowHandle())
	{
		if (!handle.equals(mainWindowHandel))
		{
			driver.switchTo().window(handle);
			break;
		}
	} */
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500);");
	}

	
	}

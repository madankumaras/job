package Sampel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugestion {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Jiocinema.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='SEARCH']")).click();
		Thread.sleep(3000);
		WebElement from=driver.findElement(By.xpath("//input[@id='searchInputBox']"));
		from.sendKeys("fuh");
		Thread.sleep(3000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		

}
}

package Sampel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commends {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Shirts");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();

}
}
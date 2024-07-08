package Sampel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jiocinema {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Jiocinema.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

}
}

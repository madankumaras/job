package Sampel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandel {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		 String parentwindowhandle=driver.getWindowHandle();
	        System.out.println("the parent window handle is "+parentwindowhandle);

		
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		} 
		Set<String>windowhandles=driver.getWindowHandles();
		 String lastwindowhandle= "";
		for (String handle:windowhandles)
		{
			System.out.println("The windew handles are"+handle);
			Thread.sleep(2000);
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			driver.get("https://www.google.com");
		}
		Thread.sleep(2000);
		driver.switchTo().window(parentwindowhandle);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(lastwindowhandle);
		Thread.sleep(2000);
		driver.quit();
		
		
			
}
}
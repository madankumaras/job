package Sampel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class biggboss {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Jiocinema.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).click();
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).sendKeys("pavada pur");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='mui-style-cliz97-contentWrapper']//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//button[1]//div[2]")).click();
		Thread.sleep(3000);
		String act_title=driver.getTitle();
		System.out.println(act_title);
		Thread.sleep(2000);
		WebElement all=driver.findElement(By.xpath("//div[@class='mui-style-jt2v2l-container']"));
		String discription = all.getText();
		System.out.println(discription);
		Thread.sleep(2000);
		
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	     	js.executeScript("window.scrollBy(0,600);");
	 //  driver.findElement(By.xpath("//h5[normalize-space()='Season 16']")).click() ; 	
	   Thread.sleep(3000);
	   for (int i= 0; i<=70; i++)
	   {
	   driver.findElement(By.xpath("//div[@class='MuiStack-root mui-style-1rplq84']//label[2]//*[name()='svg']")).click();
	   Thread.sleep(2000);
	   } 	
/*	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[118]/div[1]/div[1]/a[1]/div[1]/button[1]/picture[1]/img[1]")).click();
	   Thread.sleep(3000);
	   for (int i= 0; i<=280; i++)
	   {
		  
	   {
	   driver.findElement(By.xpath("//button[@aria-label='Skip forward by 10 seconds']//*[name()='svg']")).click();
	   Thread.sleep(800);  
	   
	  
	   }
		   
}   */
}
}

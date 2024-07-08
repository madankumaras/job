package Sampel;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class abhi {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Jiocinema.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).click(); 
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).sendKeys("ramachari");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='mui-style-cliz97-contentWrapper']//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//button[1]//div[2]")).click();
		Thread.sleep(3000);
		String act_title=driver.getTitle();
		System.out.println(act_title);
		 String RESET = "\u001B[0m";
		String RED = "\u001B[31m";
		 Actions dragger = new Actions(driver);
		try {
			WebElement cast=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-heading5SemiBold mui-style-fufoit-castTxtName']"));
		    String text = cast.getText();
		    System.out.println(text);
		} catch (Exception e) {
			System.out.println(RED+"Cast is fail to display"+ RESET);
		}
		
		try {
			WebElement Language=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-p mui-style-1sl9miq-p-txt']"));
		    String text = Language.getText();
		    System.out.println(text);
		} catch (Exception e) {
			System.out.println(RED+"Language is fail to display"+ RESET);
		}
		
		try {
			WebElement Genre=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-p mui-style-1coeqd5-p-txt-listIcon'])[1]"));
		    String text = Genre.getText();
		    System.out.println(text);
		} catch (Exception e) {
			System.out.println(RED+"Genre is fail to display"+ RESET);
		}
		
		try {
			WebElement age=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-p mui-style-1coeqd5-p-txt-listIcon'])[2]"));
		    String text = age.getText();
		    System.out.println(text);
		} catch (Exception e) {
			System.out.println(RED+"Age rating is fail to display"+ RESET);
			}
		  JavascriptExecutor js=(JavascriptExecutor)driver;
	     	js.executeScript("window.scrollBy(0,400);");
	     	Thread.sleep(2000);
	     	
	     	driver.findElement(By.xpath("(//img[@class=\"mui-style-13exe5a-image-full\"])[1]")).click();
	 	   Thread.sleep(6000);
	 	 
		
	 	  WebElement add = driver.findElement(By.xpath("//div[@class='jads-col-2 jads-p-col-half jads-flex-center jads-f-align-right']"));
		for( int j=0; j<101; j++)
		{
		
	 	  if (add == add) {
	 		  
	 		 Thread.sleep(30000);  
	 		 WebElement player_data=driver.findElement(By.xpath("(//div[@class='MuiStack-root mui-style-1cuxvzi'])[1]"));
			    String text = player_data.getText();
			    System.out.println(text); 
			    
				
				WebElement slidableItm = driver.findElement(By.xpath("(//input[@class='mui-style-k3lvgb-slider'])[1]"));
				dragger.clickAndHold(slidableItm).moveByOffset(430, 0).build().perform();
				
				Thread.sleep(4000);
	 	  
		} 
		
	 	  else {
	 	 
	 		
			WebElement slidableItm = driver.findElement(By.xpath("(//input[@class='mui-style-k3lvgb-slider'])[1]"));
			dragger.clickAndHold(slidableItm).moveByOffset(430, 0).build().perform();
			
			Thread.sleep(4000);
			
			 	  }
		
	 	  
	 	 Thread.sleep(8000); 
	 //	 WebElement add2 = driver.findElement(By.xpath("//div[@class='jads-col-2 jads-p-col-half jads-flex-center jads-f-align-right']"));
		
		if (2 == 2) {
			Thread.sleep(30000); 
			for (int i=0; i<10; i++ )
			{
			driver.findElement(By.xpath("//button[@aria-label='Skip forward by 10 seconds']//*[name()='svg']")).click();
			Thread.sleep(2000);
		}
		}
	 	  
	/*	else {
			for (int i=0; i<10; i++ )
			{
			driver.findElement(By.xpath("//button[@aria-label='Skip forward by 10 seconds']//*[name()='svg']")).click();
			Thread.sleep(2000);
			
		}   */
		}
		}
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
		
}

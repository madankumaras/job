package Sampel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abhie337 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Jiocinema.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).click();
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).sendKeys("Abhi Tailor S1 E3");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='mui-style-cliz97-contentWrapper']//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//button[1]//div[2]")).click();
		Thread.sleep(3000);
		 Actions dragger = new Actions(driver);
		  WebElement add = driver.findElement(By.xpath("//div[@class='jads-col-2 jads-p-col-half jads-flex-center jads-f-align-right']"));
			for( int j=0; j<101; j++)
			{
			
		 	  if (add == add) {
		 		  
		 		 Thread.sleep(30000);  
		 		 WebElement player_data=driver.findElement(By.xpath("(//div[@class='MuiStack-root mui-style-1cuxvzi'])[1]"));
				    String text = player_data.getText();
				    System.out.println(text); 
				    
					
					WebElement slidableItm = driver.findElement(By.xpath("(//input[@class='mui-style-k3lvgb-slider'])[1]"));
					dragger.clickAndHold(slidableItm).moveByOffset(380, 0).build().perform();
					
					Thread.sleep(4000);
		 	  
			} 
			
		 	  else {
		 	 
		 		
				WebElement slidableItm = driver.findElement(By.xpath("(//input[@class='mui-style-k3lvgb-slider'])[1]"));
				dragger.clickAndHold(slidableItm).moveByOffset(430, 0).build().perform();
				
				Thread.sleep(4000);
				
				 	  }
			
		 	  
		 	 Thread.sleep(8000); 

}
	}
}

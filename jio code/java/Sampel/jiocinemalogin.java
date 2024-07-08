package Sampel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jiocinemalogin {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Jiocinema.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//img[@class='MuiAvatar-img mui-style-1hy9t21']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-fullWidth undefined mui-style-1ekx8vs-loginBtn-loginBtn-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("3434343434");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='otp-id-0']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='otp-id-1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='otp-id-2']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@id='otp-id-3']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='otp-id-4']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='otp-id-5']")).sendKeys("9"); 
		driver.findElement(By.xpath("//button[@id='btn']")).click(); 
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//img[@class='MuiAvatar-img mui-style-1hy9t21']")).click();
		
			WebElement Genre=driver.findElement(By.xpath("(//h5[normalize-space()='Log Out'])[1]"));
		    String text = Genre.getText();
		    System.out.println(text+ "  Login Sucessfull");
		
		
		
		
		
	/*	driver.findElement(By.xpath("//input[@id='searchInputBox']")).click();
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).sendKeys("Bigg Boss Kannada");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='mui-style-cliz97-contentWrapper']//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//button[1]//div[2]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
	     	js.executeScript("window.scrollBy(0,500);");
	     	
	     	Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Bigg Boss Kannada: 24hrs LIVE Channel JioCinema']")).click(); */

	}

}

package Sampel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jiotest {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Jiocinema.com");
		Thread.sleep(3000);
		
/*	driver.findElement(By.xpath("//img[@class='MuiAvatar-img mui-style-1hy9t21']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-c"
				+ "ontained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-fullWidth"
				+ " MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall"
				+ " MuiButton-fullWidth mui-style-cynpof-loginBtn-loginBtn']")).click();
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
		Thread.sleep(3000);   */
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).click();
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).sendKeys("kyy ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='mui-style-cliz97-contentWrapper']//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//button[1]//div[2]")).click();
		Thread.sleep(3000);
		String act_title=driver.getTitle();
		System.out.println(act_title);
	//	WebElement cast=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-heading5SemiBold mui-style-fufoit-castTxtName']"));
	//	String text = cast.getText();
	//	System.out.println(text);
		Thread.sleep(2000);
		WebElement all=driver.findElement(By.xpath("//div[@class='mui-style-jt2v2l-container']"));
		String discription = all.getText();
		System.out.println(discription);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1Bold mui-style-6z4y8n']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@aria-label='Skip forward by 10 seconds']//*[name()='svg']")).click();
	//	Thread.sleep(2000);
		Actions dragger = new Actions(driver);
		
		WebElement slidableItm = driver.findElement(By.xpath("(//input[@class='mui-style-k3lvgb-slider'])[1]"));
		dragger.clickAndHold(slidableItm).moveByOffset(100, 0).build().perform();
		
		Thread.sleep(4000);
		
		dragger.clickAndHold(slidableItm).moveByOffset(460, 0).build().perform();
	
		
		
		
		
		

}
}

package Sampel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movies {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Jiocinema.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).click();
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).sendKeys("Vikram Vedha");
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
		try {
			WebElement Discription=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-heading4SemiBold mui-style-12a3t8f-txt']"));
		    String text =Discription.getText();
		    System.out.println(text);
		} catch (Exception e) {
			System.out.println(RED+"Discription is fail to display"+ RESET);
		}

}
}

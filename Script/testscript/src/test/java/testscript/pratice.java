package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pratice {
	static WebDriver driver ;
	static int number = 123 ;
	
	    public static void main(String[] args) {
	       
	    	
	    	
	    	WebDriverManager.chromedriver().setup();
	    	ChromeDriver driver = new ChromeDriver();
	    	
	    	driver.get("https://google.com");
	    	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("" +number);
	    	
	    	
	    }
	}



package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoreport {

	public static void main(String[] args) {
		
		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest to Open", "Jio Cinema");
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver	= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        test.log(Status.INFO, "Test Starts");
        
        driver.get("https://jiocinema.com");
        
        test.pass("Navigated to jiocinema");
        
         driver.manage().window().maximize();
       
		
		driver.findElement(By.xpath("//input[@id='searchInputBox']")).sendKeys("RCB");
		driver.findElement(By.xpath("(//div[@class='mui-style-1v5keco-gradient'])[1]")).click();
		
		test.pass("Navigated to jiocinema");  
		
		
		test.info("test complited");
		extent.flush();
		

	}

}

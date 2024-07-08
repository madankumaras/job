package job;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class job2 {


	static WebDriver driver ;

	public static void sendNumber( int number)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://stage-playbackcqc.jiocinema.com/create-job");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("" +number);
	/*	driver.findElement(By.xpath("//input[@name='androidtv']")).click();
		driver.findElement(By.xpath("//input[@name='iostv']")).click();
		driver.findElement(By.xpath("//input[@name='samsungtv']")).click();
		driver.findElement(By.xpath("//input[@name='androidmobile']")).click();
		driver.findElement(By.xpath("//input[@name='iosmobile']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Create Job']")).click();

		driver.findElement(By.xpath("//p")).click();  */
	}


}

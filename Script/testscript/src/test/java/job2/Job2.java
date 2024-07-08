package job2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Job2 {


	static WebDriver driver ;


	@SuppressWarnings("deprecation")

	public static void chrome()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://stage-playbackcqc.jiocinema.com/create-job");


	}


	public static void sendNumber( int number) throws InterruptedException
	{


		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("" +number);
		driver.findElement(By.xpath("//input[@name='androidtv']")).click();
		driver.findElement(By.xpath("//input[@name='iostv']")).click();
		driver.findElement(By.xpath("//input[@name='samsungtv']")).click();
		driver.findElement(By.xpath("//input[@name='androidmobile']")).click();
		driver.findElement(By.xpath("//input[@name='iosmobile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Create Job']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p")).click();  

	}
	
	public static void clear()
	{
		driver.findElement(By.xpath("//input[@type='text']")).clear();
	}


}




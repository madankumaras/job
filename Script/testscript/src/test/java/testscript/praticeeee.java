package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class praticeeee   {


	static WebDriver driver ;


	@SuppressWarnings("deprecation")

	public static void chrome() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https:google.com");



	}


	public static void sendNumber( int number) throws InterruptedException  
	{

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("" + number);



	}

	public static void main(String[] args) throws InterruptedException {

		chrome();
		sendNumber(5555);
	}


}

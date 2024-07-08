package Sampel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrm {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//Verify the URL
		String act_url=driver.getCurrentUrl();
		System.out.println(act_url);
		
		//verify
		String desired_url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		if(act_url.equals(desired_url))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		Thread.sleep(3000);
		//verify Title
		String act_title=driver.getTitle();
		System.out.println(act_title);
		
		
		String act_sour=driver.getPageSource();
		System.out.println(act_sour);
		driver.close();
		
}
}

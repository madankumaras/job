package job;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import util_data.exel;

public class mainjob
{

	static String projectpath1 = System.getProperty("user.dir");

	static job1 excel = new job1(projectpath1 + "\\excel\\Data.xlsx" , "Sheet1");


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://stage-playbackcqc.jiocinema.com/create-job");


		driver.manage().window().maximize();

		try {
			excel.exceldata(0,0);
		} catch (Exception e) {

			e.printStackTrace();
		}



	}


}
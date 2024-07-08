package testscript;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class job_id {

	static String projectpath; 
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static WebDriver driver ;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://stage-playbackcqc.jiocinema.com/create-job");

		driver.manage().window().maximize();
		getcelldata();

	}
	
	public static void sendNumber(WebDriver driver, double number)
	{
	

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(String.valueOf(number));
		driver.findElement(By.xpath("//input[@name='androidtv']")).click();

	}

	public static void getcelldata()
	{

		for(int i=0 ; i<5; i++)
		{

			try {
				projectpath = System.getProperty("user.dir");	
				workbook = new XSSFWorkbook(projectpath + "\\excel\\Data.xlsx");
				sheet = workbook.getSheet("Sheet1");
				for(int j=0 ; j<5; j++)
				{
				double number =sheet.getRow(1).getCell(j).getNumericCellValue(); 
				sendNumber(driver, number);
				}
			}

			catch(Exception exp)
			{
				exp.printStackTrace();
			}
		}
	}

}

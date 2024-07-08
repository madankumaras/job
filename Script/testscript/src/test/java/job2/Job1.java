package job2;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class Job1 {


	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static WebDriver driver;

	static String projectpath1 = System.getProperty("user.dir");

	static Job1 excel = new Job1(projectpath1 + "\\excel\\Data.xlsx" , "Sheet1");


	public Job1(String excelpath, String sheetName) {
		try {

			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetName);
		}

		catch(Exception exp)
		{
			exp.printStackTrace();
		}

	}

	
	public static void exceldata(int rowNum, int colNum)
	{

		try {

			int number =(int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue(); 
			Job2.sendNumber(number);

		}

		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
		

	/*	public static void enterdata2(int rowNum, int colNum , String copiedText)
		{

			try {

				 sheet.getRow(rowNum).createCell(colNum).setCellValue(copiedText);
				

			}

			catch(Exception exp)
			{
				exp.printStackTrace();
			}


	}         */
	
}



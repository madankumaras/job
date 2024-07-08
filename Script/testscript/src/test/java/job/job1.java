package job;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



public class job1 {

	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static WebDriver driver;
	

	public job1(String excelpath, String sheetName) {
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
			job2.sendNumber(number);
			System.out.println(number);
		}

		catch(Exception exp)
		{
			exp.printStackTrace();
		}
		
		
	}
}



package util_data;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exel {

	static String projectpath; 
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;


	public exel(String excelpath, String sheetName) {
		try {

			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetName);
		}

		catch(Exception exp)
		{
			System.out.println(exp.getMessage());	
			System.out.println(exp.getCause());	
			exp.printStackTrace();
		}

	}


	public static void getRowCount() {

		try {

			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);
		}

		catch(Exception exp)
		{

			exp.printStackTrace();
		}
	}
	public static void getcolCount() {

		try {

			int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(colcount);
		}

		catch(Exception exp)
		{

			exp.printStackTrace();
		}
	}
	public static void getcelldatastring(int rowNum, int colNum)
	{
		try {

			System.out.println(sheet.getRow(rowNum).getCell(colNum).getStringCellValue()); 
		}

		catch(Exception exp)
		{

			exp.printStackTrace();
		}
	}
	public static void getCelldatanumber(int rowNum, int colNum)
	{
		try {

			int cell = (int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue(); 
			System.out.println(cell);
		}

		catch(Exception exp)
		{
			
			exp.printStackTrace();
		}
		
		
	}



}

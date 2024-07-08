package util_data;

public class excelpath {

	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		
		exel excel = new exel(projectpath + "\\excel\\Data.xlsx" , "Sheet1");
		
	//	excel.getRowCount();
		//excel.getcolCount();
	//	excel.getcelldatastring(0, 0);
		excel.getCelldatanumber(3,0);
		

	}

}


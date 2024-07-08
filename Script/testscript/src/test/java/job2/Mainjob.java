package job2;

public class Mainjob {


	public static void main(String[] args) throws InterruptedException {

		Job2.chrome();

		for(int i=0; i<=57 ; i++)
		{
			Job1.exceldata(i, 0);
			Thread.sleep(3000);
			Job3paste.past();
		}
		
		
		
		Job2.driver.quit();
	}


}

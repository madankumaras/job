package logeer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {
	
	// it is non static varible hence we need to creat object in static method
	
	private static Logger loger = LogManager.getLogger(log4jdemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n         hello world....!      \n");
		
		
		
		loger.info("This is information method"); 
		loger.error("This is error msg");
		loger.warn("This is warn msg");
		loger.fatal("This is Fatel msg");
		
		
		System.out.println("\n          complited   ");
		
	}

}

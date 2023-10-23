package Utilities;

//import java.util.logging.Logger;

//import java.util.logging.LogManager;
//import org.apache.lo

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class TestLogs {
	
	//public static Logger log = Logger.getLogger(TestLogs.class.getName());
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = LogManager.getLogger(TestLogs.class.getName());
		
		log.error("Test error new");
		log.info("This is an information log");
		log.debug("This is a debug log");
		
		/*Date d = new Date();
		
		System.out.println(d.toString().replace(":", "_").replace("", "_"));
		System.setProperty("current.date", d.toString().replace(":", "_").replace("", "_"));
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		log.info("This is the information log");*/
		
		//log.error("Here the error logs will be printed");
		
		
	}

}

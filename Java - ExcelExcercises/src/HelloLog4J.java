import java.util.logging.Logger;

public class HelloLog4J {

	static Logger LOGGER = Logger.getLogger(HelloLog4J.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOGGER.debug("Logger Debug");
		LOGGER.info("Logger Info");
		LOGGER.error("Logger error");
		
	}

}

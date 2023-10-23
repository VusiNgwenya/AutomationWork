import java.util.logging.Logger;

public class TestLog4J {

	static Logger log = Logger.getLogger(TestLog4J.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("This is a Debug Log");
		log.info("This is a Info Log");
		log.error("Error in a Project");
	}

}

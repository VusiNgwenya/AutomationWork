package Testcases;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "/Users/abvn237/eclipse-workspace/SeleniumThree/msedgerdriver");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://way2automation.com");
	}

}

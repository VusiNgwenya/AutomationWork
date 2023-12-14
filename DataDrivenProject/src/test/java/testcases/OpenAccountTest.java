package testcases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.w2a.utilities.DataUtil;

import base.BaseTest;

public class OpenAccountTest extends BaseTest
{

	@Test(dataProviderClass = DataUtil.class,dataProvider="dp")
	public void openAccountTest(String customer,String currency)
	{
		 click("openAccBtn_CSS");
		 select("customer_CSS",customer);
		 select("currency_CSS",currency);
		 click("process_CSS");
		 
		 Alert alert = driver.switchTo().alert();
		 
	}
}

package Java_EE_WebDriverNewModules;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewLoginTest {
	
	@Test(dataProviderClass=DataProvider.class,dataProvider="dpi")
	public void testData(String username,String password)
	{
		System.out.println(username+"----"+password);
	}
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dpi")
	public void testUserReg(String fname,String lname,String email)
	{
		
	}

}

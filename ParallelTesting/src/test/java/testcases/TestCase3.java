package testcases;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase3 
{

	@Parameters({"browser","url"})
	@Test
	public void doLogin(String browser,String url)
	{
		Date d = new Date();
		
		System.out.println(browser+"------"+url);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}

package testnglearning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallelTest
{
	@Parameters({"browser","url"})
	@Test
	public void doLogin(String username,String password)
	{
		System.out.println(username+"----"+password);
	}

}

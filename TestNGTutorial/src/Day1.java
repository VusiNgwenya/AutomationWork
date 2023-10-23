import org.junit.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 
{

	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void afSyite()
	{
		System.out.println("I am the no 1 from the last");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("bye");
	}
}

package packOne;

import org.testng.annotations.Test;

public class Demo1 {

	
	@Test(timeOut=1000)
	public void firstTestCase() throws InterruptedException
	{
		System.out.println("I am in the first test case from demoOne class");
		Thread.sleep(1500);
	}
	
	@Test
	public void secondTestCase()
	{
		System.out.println("I am in second test case from demoOne Class");
	}
}

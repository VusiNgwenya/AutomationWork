import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day2
{

	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeClass
	public void prerequisite()
	{
		System.out.println("I will wexecute first");
	}
}

package testnglearning;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;

public class TestCase2
{

	@Test
	public void validateTitle()
	{
		String actual_title="Gmail.com";
		String expected_title="Yahoo.com";
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	}
}

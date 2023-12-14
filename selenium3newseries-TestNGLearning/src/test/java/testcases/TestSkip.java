package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {

	@Test
	public void isSkip()
	{
		if(true)
		throw new SkipException("Skipping the test as the condition");
	}
}

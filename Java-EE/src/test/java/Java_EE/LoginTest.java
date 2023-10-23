package Java_EE;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.fail;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginTest extends TestBase {
	
	@Test(priority=1)
	public void doLogin()
	{
		driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.id("next")).click();
	}
	
	
	public void composeEmail()
	{
		AssertJUnit.fail("Error in composing Email");
	}

}

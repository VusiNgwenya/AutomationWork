package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;


@Epic("Allure examples")
@Feature("Login Feature")
public class TestCase1 
{

	@Test
    @Description("Login Test")
	@Severity(SeverityLevel.CRITICAL)
	@Story("In order to perform login")
	@Story("User entered username and password")
	public void doLogin() throws FileNotFoundException
	{
		System.out.println("Test Case pass");
		InputStream is = new FileInputStream("/AllureReporting/");
		//Allure.addAttachment("Screenshot", null);
	}
	
	@Test
	@Description("User Reg Test")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Performing User registration test")
	public void doUserReg()
	{
		Assert.fail();
	}
	
	@Test
	public void isSkip()
	{
		throw new SkipException("Skipping the test case")
	}
}

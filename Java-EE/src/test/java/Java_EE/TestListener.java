package Java_EE;

import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends TestBase implements ITestListener{

	@Override 
	public void onFinish(ITestContext arg0)
	{
		TestUtil.zip(System.getProperty("user.dir")+"\\screenshot");
		monitoringMail mail = new monitoringMail();
		
		try
		{
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath,TestConfig.attachmentName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(MessagingException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	@Override
	public void onStart(ITestContext arg0)
	{
		
	}
	
	@Override
	public void onTestFailedButWithSuccessPercentage(ITestResult arg0)
	{
		
	}
	
	@Override
	public void OnTestFailure(ITestResult result)
	{
		String methodName = result.getName().toString().trim();
		
		try
		{
			TestUtil.captureScreenshot(methodName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override 
	public void onTestSkipped(ITestResult arg0)
	{
		
	}
	
	@Override 
	public void onTestStart(ITestResult arg0)
	{
		
	}
	
	@Override
	public void onTestSuccess(ITestResult arg0)
	{
		
	}
}

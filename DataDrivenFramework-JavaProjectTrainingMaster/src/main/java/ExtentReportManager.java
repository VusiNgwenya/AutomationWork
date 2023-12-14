//import org.apache.http.client.utils.DateUtils;

import org.apache.http.impl.cookie.DateUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.datadriven.framework.utils.DateUtils;

public class ExtentReportManager 
{

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports report;
	
	public static ExtentReports getReportInstance()
	{
		if(htmlReporter == null && report == null)
		{
			String reportName = DateUtils.getTimeStamp();
			
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dit")+"/test-out/testreport.html");
			report = new ExtentReports();
			
			report.attachReporter(htmlReporter);
			
			report.setSystemInfo("OS", "Windows 10");
			report.setSystemInfo("Environment", "UAT");
			report.setSystemInfo("Build Number", "10.8.1");
			report.setSystemInfo("Browser", "Chrome");
			
			htmlReporter.config().setDocumentTitle("UAT UI Automation Results");
			htmlReporter.config().setReportName("All Headlines UI Test Report");
			htmlReporter.config().setTestChartLocation(ChartLocation.TOP);
		}
		
		return report;
	}
}

package Utilities;

import sendingMails.MonitoringMail;
import sendingMails.TestConfig;

public class TestMail 
{
	public static void main(String[] args)
	{

	MonitoringMail monitoringMail = new MonitoringMail();
	
	monitoringMail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, 
			TestConfig.attachmentPath, TestConfig.attachmentName);
	
	}
	
	
}

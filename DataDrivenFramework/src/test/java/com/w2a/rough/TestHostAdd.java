package com.w2a.rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

import sendingMails.MonitoringMail;
import sendingMails.TestConfig;

public class TestHostAdd {
	
	public static void main(String args[]) throws UnknownHostException
	{
		MonitoringMail mail = new MonitoringMail();
		
		String messageBody = "http://"+InetAddress.getLocalHost()+
				"8080/job/DataDrivenLiveProject/Extent_Reports";
		
		System.out.println(messageBody);
		
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, messageBody, messageBody);
		
	}

}

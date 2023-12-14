package com.sample.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import com.sun.net.httpserver.Authenticator.Retry;

public class RetryListener implements IAnnotationTransformer {

	
	@Override 
	public void transform(ITestAnnotation arg0,Class arg1, Constructor arg2, Method arg3)
	{
		IRetryAnalyzer analyzer = arg0.getRetryAnalyzerClass();
		
		if(analyzer == null)
		{
			arg0.setRetryAnalyzer(Retry.class);
		}
		
	}
	

}

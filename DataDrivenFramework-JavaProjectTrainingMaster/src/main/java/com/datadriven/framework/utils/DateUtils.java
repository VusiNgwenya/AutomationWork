package com.datadriven.framework.utils;

import java.util.Date;

public class DateUtils 
{
	
	public static void main(String args[])
	{
		Date date = new Date();
		
		System.out.println(date.toString().replaceAll(":","_").replaceAll(" ", "_"));
		
	}

}

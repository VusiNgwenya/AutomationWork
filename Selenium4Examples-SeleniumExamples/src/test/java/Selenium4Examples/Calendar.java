package Selenium4Examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException, ParseException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		WebDriver driver = null;
		
		
		driver = new FirefoxDriver();
		
		
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.id("depatureCalendar")).click();
		
		Thread.sleep(3000);
		
		String d = "16/07/2021";
		
		String months[] = {"January","March","April","May","June","July","August","September","November","December"};
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Date mydate = df.parse(d);
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(mydate);
		
		int day = cal.get(java.util.Calendar.DAY_OF_MONTH);
		int month = cal.get(java.util.Calendar.MONTH);
		int year = cal.get(java.util.Calendar.YEAR);
		
		System.out.println(day);
		System.out.println(months[month]);
		System.out.println(year);
		
		String forwardArrow = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']";
		String travelMonth = months[month]+" "+year;
		System.out.println(travelMonth);
		String xpathMonthYearSection = "//div[@class='fareCalFit']/div/div[2]/div";
		
		while(!driver.findElement(By.xpath(xpathMonthYearSection)).getText().equals(travelMonth))
		{
			driver.findElement(By.xpath(forwardArrow)).click();
		}
		
		driver.findElement(By.xpath("//div[text()='"+day+"']")).click();

	}

}

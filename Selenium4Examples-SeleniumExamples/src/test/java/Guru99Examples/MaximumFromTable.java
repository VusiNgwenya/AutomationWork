package Guru99Examples;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximumFromTable {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String max;
		double m =0,r=0;
		
		WebDriver wd;
		
		System.setProperty("webdriver.firefox.driver", "/Selenium4Examples-SeleniumExamples/geckodriver");
		
		wd = new FirefoxDriver(); 
		
		wd.get("http://money.refiff.com/gainers/bsc/groupa?");
		
		List<WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		
		System.out.println("Total No of columns are :"+col.size());
		
		List<WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		System.out.println("Toltal No of rows are :"+rows.size());
		
		for(int i=1;i<rows.size();i++)
		{
			max = wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = f.parse(max);
			
			max = num.toString();
			
			m = Double.parseDouble(max);
			
			if(m>r)
			{
				r=m;
			}
		}
		
		System.out.println("Maximum Current price is : "+r);
		

	}

}

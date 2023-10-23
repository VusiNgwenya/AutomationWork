package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver", "/Assignment3/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		
		driver.navigate().to("https://timesofindia.indiatimes.com/poll.cms");
		
		String answrText = driver.findElement(By.cssSelector("#mathq2")).getText();
		
		
		if(answrText.contains("+"))
		{
			String strNum1 = answrText.substring(0,1);
			
			String strNum2 = answrText.substring(4).replace("=", "").trim();
		
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			int sum = num1 + num2;
			
			String strSum = String.valueOf(sum);
			
			System.out.println(strSum);
			
			driver.findElement(By.id("mathuserans2")).sendKeys(strSum);
		}
		else if(answrText.contains("-"))
		{
            String strNum1 = answrText.substring(0,1);
			
			String strNum2 = answrText.substring(4).replace("=", "").trim();
		
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			int sub = num1 - num2;
			
			String strSub = String.valueOf(sub);
			
			System.out.println(strSub);
			
			driver.findElement(By.id("mathuserans2")).sendKeys(strSub);
		}
		else if(answrText.contains("*"))
		{
            String strNum1 = answrText.substring(0,1);
			
			String strNum2 = answrText.substring(4).replace("=", "").trim();
		
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			int mult = num1 * num2;
			
			String strMult = String.valueOf(mult);
			
			System.out.println(strMult);
			
			driver.findElement(By.id("mathuserans2")).sendKeys(strMult);
		 } 
		else 
		 {
			 String strNum1 = answrText.substring(0,1);
				
				String strNum2 = answrText.substring(4).replace("=", "").trim();
			
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				
				int div = num1 / num2;
				
				String strDiv = String.valueOf(div);
				
				System.out.println(strDiv);
				
				driver.findElement(By.id("mathuserans2")).sendKeys(strDiv);
		}
			
		driver.close();
	
	}

}

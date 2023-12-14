//Selenium 4 WebDriver with java(Basics + Advance + Architect) - Section 28 - Assignment 1 - Searching flight information - Vusi Ngwenya

package Assignment_1_Searching_Flight_Information;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1_Searching_Flight_Information {
	
	  public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "/Assignment_1-Searching_Flight_Information/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.makemytrip.com/");
		
		selectAndEnterFromLocation(driver);
		
		selectAndEnterDestination(driver);
		
		selectDepatureDate(driver);
		
		selectReturnDate(driver);
		
		searchFlight(driver);
		
		printTotalNumberofFlightNamesDisplayed(driver);
		
		printTotalNumberofFlightPricesDisplayed(driver);
		
	}
	
	public static void selectAndEnterFromLocation(WebDriver driver) throws InterruptedException
	{
        WebElement rbRoundTrip = driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/div/div[1]/ul/li[2]/span"));
		
		for(int i=0;i<2;i++)
		{
			rbRoundTrip.click();
			
			System.out.println(rbRoundTrip.isSelected());
		}
		
		WebElement fromClick = driver.findElement(By.id("fromCity"));
		
		fromClick.click();
		
		Thread.sleep(1000);
		
		WebElement fromInput = driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		
		fromInput.sendKeys("New York");
		
		Thread.sleep(5000);
		
		WebElement autoSuggest = driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-1"));
		
		autoSuggest.click();
	}
	
	public static void selectAndEnterDestination(WebDriver driver) throws InterruptedException
	{
        WebElement toClick = driver.findElement(By.cssSelector("div.flt_fsw_inputBox:nth-child(3) > label:nth-child(1) > span:nth-child(1)"));
		
		toClick.click();
		
		WebElement inputTo = driver.findElement(By.cssSelector(".react-autosuggest__input"));
		
		inputTo.sendKeys("London");
		
		Thread.sleep(5000);
		
		WebElement autoSuggestInputTo = driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-1"));
		
		autoSuggestInputTo.click();
		
		Thread.sleep(5000);
	}
	
	public static void selectDepatureDate(WebDriver driver) throws InterruptedException
	{
        WebElement flightDepature = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[6]/div"));
		
		flightDepature.click();
		
		Thread.sleep(5000);
	}
	
	public static void selectReturnDate(WebDriver driver) throws InterruptedException
	{
        WebElement flightReturn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[6]/div"));
		
		Thread.sleep(1000);
		
		flightReturn.click();
		
		Thread.sleep(1000);
	}
	
	public static void searchFlight(WebDriver driver)
	{
        WebElement searchFlight = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/p/a"));
		
		searchFlight.click();
	}
	
	public static void printTotalNumberofFlightNamesDisplayed(WebDriver driver)
	{

		int totalFlightNum = 0;
		
		List<WebElement> flight = driver.findElements(By.className("boldFont blackText airlineName"));
		
		for(int i=0;i<driver.findElements(By.className("boldFont blackText airlineName")).size();i++)
		{
			
			totalFlightNum = flight.get(i).getText().length();
			System.out.println("The total number of flights is : "+totalFlightNum);
		}
	}
	
	public static void printTotalNumberofFlightPricesDisplayed(WebDriver driver)
	{
        int totalPriceValue = 0;
		
		List<WebElement> price = driver.findElements(By.className("blackText fontSize18 blackFont white-space-no-wrap"));
		
		for(int i=0;i<driver.findElements(By.className("blackText fontSize18 blackFont white-space-no-wrap")).size();i++)
		{
			
			totalPriceValue = price.get(i).getText().length();
			System.out.println("The total number of flights is : "+totalPriceValue);
		}
		
		driver.close();
	}
}

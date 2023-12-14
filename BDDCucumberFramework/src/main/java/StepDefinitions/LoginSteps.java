package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Then;
import junit.framework.Assert;,api.java.en.Given;


public class LoginSteps
{
    WebDriver driver = null;
	
	@Given("^User is on Application Home page$")
	public void user_application_home_page()
	{
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"/BDDCucumberFramework/");
		
		driver = new FirefoxDriver();
		
	}
	

	@When("^Application Page Title is FREE CRM$")
	public void application_Page_Title_is_FREE_CRM()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "#1 Free CRM for Any Business: Online Customer Relationship Software";
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String uname,String password)
	{
		driver.findElement(By.name("username")).sendKeys("ashulc55");
		driver.findElement(By.name("password")).sendKeys("Anshul@123");
	}
	
	@Then("^user clicks on Login  Button$")
	public void user_clicks_on_Login_Button()
	{
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
	}
	
	
	@Then("^user navigate to user profile$")
	public void user_navigate_to_user_profile()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "CRMPRO";
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	
	@Then("^User fills the signup form$")
	public void user_fills_the_signup_form()
	{
		throw new PendingException();
	}
	
	
	@Then("^User clicks the Submit Button$")
	public void user_clicks_the_submit_button()
	{
		throw new PendingException();
	}
	
	@Then("^Display already registered message$")
	public void display_already_Registered_message()
	{
		throw new PendingException();
	}
	
	@Then("^Navigate to reset password page$")
	public void display_already_Registered_message()
	{
		throw new PendingException();
	}
	
	@Then("^Close the Browser")
	public void close_the_Browser()
	{
		driver.close();
	}
	
	
	
}

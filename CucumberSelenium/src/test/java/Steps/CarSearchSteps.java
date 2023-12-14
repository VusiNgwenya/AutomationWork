package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarSearchSteps 
{

	public WebDriver driver;
	
	@Then("^I click on Find My Next Car button$")
	public void i_click_on_Find_My_Next_Car_button() throws Throwable
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='search_submit']")).click();
	}
	
	@When("^I move to Car for Sale Menu$")
	public void i_move_to_Car_for_Sale_Menu()
	{
		
	}
	
	@Then("^I click on Search Cars$")
	public void i_click_on_Search_Cars()
	{
		driver.findElement(By.xpath("//*[@id='view_car_deal']/ul/li[1]/a")).click();
	}
	
	@Then("^I select Make as\"([^\"*)\"$")
	public void i_select_Make_as(String make) throws Throwable
	{
		Thread.sleep(1000);
		
		new Select(driver.findElement(By.xpath("//*[@id='makes']"))).selectByVisibleText();
		
	}
	
	
	@Then("^I select price as \"([^\"]*)\"$")
	public void i_select_price_as(String price) throws Throwable
	{
		
		new Select(driver.findElement(By.xpath("//*[@id='price-max']"))).selectByVisibleText();
	}
	
	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_card() throws Throwable
	{
		
	}
	
	@Then("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be() throws Throwable
	{
		
	}
}

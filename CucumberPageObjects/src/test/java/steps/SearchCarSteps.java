package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class SearchCarSteps
{
   CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
   CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions
	
	@Given("^I am on the Home Page\"([^\"]\") of Credentials")
	public void i_am_on_the_Home_Page_of_CardGuide_website(String websiteURL)
	{
		SeleniumDriver.openPage(websiteURL);
	}
	
	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable
	{
		String menu = list.get(1);
		System.out.println("Menu selected is :"+menu);
	}
	
	@And("6click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable
	{
		
	}
			
}

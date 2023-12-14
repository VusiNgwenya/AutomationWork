package runner;

import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features"},
		glue= {"steps"},
		monochrome=true,
		plugin= {"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber"})


public class TestRunner 
{

	
}

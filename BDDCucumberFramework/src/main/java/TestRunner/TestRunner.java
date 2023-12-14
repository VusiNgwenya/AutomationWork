package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.TestNGCucumberRunner;
import io.cucumber.testng.*;

import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "/BDDCucumberFramework/src/main/java/features/login.feature",
		 glue = {"stepDefinitions"},
		 format = {"pretty","html:test-outout","json:report_json/cucumber.json","junit:report_json"},
		 dryRun = false,
		 monochrome = true,
		 strict = true
		)

public class TestRunner
{

	
}

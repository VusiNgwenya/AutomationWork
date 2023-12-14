package runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue= {"steps"},
monochrome=true,
tags= {"@sanity , @prod"},
plugin={"pretty","html:target/cucumber"})

public class RunCuke {
	
	

}

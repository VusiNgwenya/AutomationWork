package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class StepDefinitions {
	

	    @Before
	    public void doSomethingBefore()
	    {
	    	
	    }
	    
	    @BeforeStep
	    public void doSomethingBeforeStep()
	    {
	    	
	    }
		
		@Given("I have {int} cukes in my belly")
		public void i_have_n_cukes_in_my_belly(int cukes)
		{
			
		}
		
		@After
		public void doSomethingAfter()
		{
			
		}
	
		@AfterStep
		public void doSomethingAfterStep()
		{
			
		}
}

package steps;

import io.cucumber.core.runner.Runner;
import io.cucumber.java.en.And;


public class LoginProdSteps {
	
	@And("user validates captcha image")
	public void user_validates_captcha_image()
	{
		System.out.println("@And - User validates captcha image");
	}

}

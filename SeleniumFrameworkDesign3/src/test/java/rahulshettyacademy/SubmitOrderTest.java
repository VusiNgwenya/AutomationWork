package test.java.rahulshettyacademy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.rahulshettyacademy.pageObjects.CartPage;
import main.java.rahulshettyacademy.pageObjects.LandingPage;
import main.java.rahulshettyacademy.pageObjects.ProductCatalogue;

public class SubmitOrderTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		  String productName = "ZARA COAT 3";
			//WebDriverManager.firefoxdriver().setup();
			//WebDriver driver = new FirefoxDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    WebDriver driver = (WebDriver) new FirefoxDriver();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
		    
		    LandingPage landingPage = new LandingPage(driver);
		    landingPage.goTo();
		    landingPage.loginApplication("anshika@gmail.com", "Iamking@000");
		    
		    ProductCatalogue productCatalogue = new ProductCatalogue(driver);
		    
		    List<WebElement> products = productCatalogue.getProductList();
		    
		    productCatalogue.addProductToCart(productName);
		   // productCatalogue.goToCartPage()
		    
		    CartPage cartPage = new CartPage(driver);
		    
		    Boolean match = cartPage.VerifyProductDisplay(productName);
		    
		    
		    
		    
		    
		    
			driver.get("https://rahulshettyacademy.com/client");
			
			driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
			driver.findElement(By.id("userPassword")).sendKeys("Ia,King@000");
			driver.findElement(By.id("login")).click();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			
			
			
			
			
			
			List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
			
			WebElement prod = products.stream().filter(product->
			product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
			prod.findElement(By.cssSelector(".card-body:last-of-type")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
			
			driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
			
			driver.findElements(By.cssSelector(".cartSection"));
			
			List <WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
			
			Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
			
			Assert.assertTrue(match);
			
			driver.findElement(By.cssSelector(".totalRow button")).click();
			
			Actions a = new Actions(driver);
			
			a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"India").build().perform();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ta-results")));
			
			driver.findElement(By.xpath("//button[]contains(@class,'ta-items')])[2]")).click();
			driver.findElement(By.cssSelector(".action__submit")).click();
			
			String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
			
			Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
			
			driver.close();
		
		

	}

}

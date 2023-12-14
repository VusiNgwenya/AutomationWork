package main.java.rahulshettyacademy.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.java.rahulshettyacademy.AbstractComponents.AbstractComponent;

public class ProductCatalogue extends AbstractComponent
{
    WebDriver driver;
    
    public ProductCatalogue(WebDriver driver)
    {
    	super(driver);
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    	
    }
    
    @FindBy(css=".mb3")
    List<WebElement> products;
    
    
    public List<WebElement> getProductList()
    {
    	waitForElementToApprear(productBy)
    	return products;
    }
    
    public WebElement getProductByName(String productName)
    {
    	WebElement prod = products.stream().filter(product->
    	product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
    	
    }
    
    public void addProductToCart(String productName)
    {
    	WebElement prod = getProductByName(productName);
    	prod.findElement(By.cssSelector(".card-body button:last-type ")).click();
    	
    }
    
}

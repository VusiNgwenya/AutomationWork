import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SampleClass
{
   WebDriver driver = new WebDriver();
   
   WebDriver chDriver = new ChromeDriver();
   WebDriver ffDriver = new FirefoxDriver();
   WebDriver isDriver = new InternetExplorerDriver();
   WebDriver sdriver = new SafariDriver();
   
}

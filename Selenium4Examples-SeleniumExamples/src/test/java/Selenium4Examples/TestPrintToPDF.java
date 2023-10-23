package Selenium4Examples;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;


public class TestPrintToPDF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("headless");
		
		System.setProperty("webdriver.firefox.driver", "/Selenim4Examples-SeleniumExamples/geckodriver");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.dev/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
		Files.write(Paths.get("./Selenium4Examples-SeleniumExamples/Selenium.pdf"),
				OutputType.BYTES.convertFromBase64Png(pdf.getContent()));

	}

}

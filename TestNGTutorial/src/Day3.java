import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 
{
    @BeforeClass
    public void befoclas()
    {
    	System.out.println("before executing any methods in the claass");
    }
    
    @Parameters({"URL","APIKey/usrname"})
	@Test
	public void webloginCarLoan(String urlname,String key)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@Test(groups="Smoke")
	public void MobilelogincarLoan()
	{
		System.out.println("Mobilelogincar");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void MobilesignimcarLoan()
	{
		System.out.println("Mobile SIGNIN");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan()
	{
		System.out.println("Mobile SIGNOUT");
	}
	
	@Test(dependsOnMethods= {"webloginCarLoan","MobilesignoutcarLoan"})
	public void LogincarLoan()
	{
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "firstusername";
		data[0][1] = "password";
		
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
}

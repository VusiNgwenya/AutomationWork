import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 
{
	@Parameters({"URL"})
	@Test
	public void webloginHomeLoan(String uname)
	{
		System.out.println("webloginhomePersonalLoan");
		System.out.println("webloginhome");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("APIloginHome");
	}

}

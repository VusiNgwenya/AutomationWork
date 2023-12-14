package polymorphism;

public class RBI {
	
	public void getHomeLoanROI(String bankName,int amount)
	{
		
	}
	
	public void getHomeLoanROI(int amount,String bankName)
	{
		
	}
	
	/*public void getHomeLoanROI()
	{
		
	}*/
	
	public double getHomeLoanROI()
	
	{
		return 3.4;
	}
	
	public double getCarLoanROI()
	{
		return 10.5;
	}
	
	public RBI getObject()
	{
		RBI obj = new RBI();
		return obj;
	}
	
	public Integer show()
	{
		return 10;
	}

}

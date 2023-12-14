package polymorphism;

public class RBI 
{
    public double getHomeLoanROI(String bankName,int amount)
    {
    	return 8.5;
    }
    
    public double getHomeLoanROI(int amount)
    {
    	return 6.5;
    }
}

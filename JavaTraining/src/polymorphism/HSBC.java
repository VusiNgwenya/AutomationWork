package polymorphism;

public class HSBC extends RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBC obj = new HSBC();
		System.out.println(obj.getHomeLoanROI("CITI", 1));

	}
	
	public double getHomeLoanROI()
	{
		return 10.25;
	}
	
	public void getObject()
	{
		
	}

}

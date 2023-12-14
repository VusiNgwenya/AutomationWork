package polymorphism;

public class CITI extends RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CITI obj = new CITI();
		
		System.out.println(obj.getHomeLoanROI());
	}
	
	public double getCarLoanROI()
	{
		return 10.5;
	}

}


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before try block");
		
		try {
		
		System.out.println("Beginning");
		
		int divide = 10 / 5;
		
		System.out.println(divide);
		
		System.out.println("Ending");
		}
		catch(Exception e)
		{
		    System.out.println("Error occurred");
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		}
		
		

	}

}

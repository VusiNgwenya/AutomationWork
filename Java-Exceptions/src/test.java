
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Beginning");
		
		System.out.println("Before try catch execution");
		
		try
		{
			System.out.println("Beginning");
			
			int divide = 10/0;
			
			System.out.println(divide);
		}
		catch(Exception e)
		{
			System.out.println("Error occurred");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("After try catch execution");

	}

}


public class Finally_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x=100;
		
		x=200;
		
		try
		{
			
		}
		catch(Exception e)
		{
			System.out.println("Error occurred");
		}finally {
			System.out.println("Closing the DB Connection in finally block");
		}
	

	}

}

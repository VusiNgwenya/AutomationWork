
public class Finally_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int i[] = new int[4];
			
			i[5] = 100;
			System.out.println("Close dbconnection in try block");
		}
		catch(Throwable e)
		{
			System.out.println("Error occurred");
		}
		finally {
			System.out.println("Closing the DB Connection in finally block");
		}

	}

}

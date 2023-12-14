
public class Array_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Beginning");
		
		try
		{
			int i[] = new int[4];
			
			i[5] = 100;
			
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Error occurred");
		}

	}

}

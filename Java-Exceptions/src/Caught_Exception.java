
public class Caught_Exception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i[] = new int[4];
		
		i[5] = 100;
		
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		Thread.sleep(1000);

		Thread.sleep(1000);

	}

}

package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("First Try Block");
			
			String text = null;
			
			System.out.println(text.length());
			
			try
			{
				System.out.println("Second Try Block");
				
				int value = 100/0;
				
				try
				{
					System.out.println("Third Try Block");
					
					int[] array = new int[3];
					array[5] = 100;
				}
				catch(Exception e)
				{
					System.out.println("End of third ");
					e.printStackTrace();
				}
			}
			catch(Exception e)
			{
				System.out.println("End of the second ");
				e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			System.out.println("End of the first ");
			e.printStackTrace();
		}

	}

}

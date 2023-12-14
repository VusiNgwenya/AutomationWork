package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] myArray = new int[2][3];
		
		myArray[0][0] = 2;
		myArray[0][1] = 2;
		myArray[0][2] = 3;
		
		myArray[1][0] = 4;
		myArray[1][1] = 5;
		myArray[1][2] = 6;
		
		
		
		for(int i=0;i<myArray.length;i++)
		{
			for(int j=0;j<myArray[0].length;j++)
			{
				
					myArray[i][j] = (int)(Math.random()*1000);
			}
			
			System.out.println();
		}
		
		
	}

}

package arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] myArray = new int[2][3];
		
		myArray[0][0] = 2;
		myArray[0][1] = 2;
		myArray[0][2] = 3;
		
		myArray[1][0] = 4;
		myArray[1][1] = 5;
		myArray[1][2] = 6;
		
		/*System.out.println(myArray[1][1]);
		System.out.println(myArray.length);
		System.out.println(myArray[0].length);*/
		
		int[][][]  array = new int[2][3][4];
		
		
		for(int i=0;i<myArray.length;i++)
		{
			for(int j=0;j<myArray[0].length;j++)
			{
				for(int k=0;k<array[i][j].length;k++)
				{
					array[i][j][k] = (int)(Math.random()*1000);
					System.out.println(array[i][j][k]+" ");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
		
		
	}

}

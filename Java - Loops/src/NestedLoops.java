
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int k=0;
		int count =0;
		
		
		while(i<3)
		{
			for(int j=0;j<4;j++)
			{
				do
				{
					
				   System.out.println("i--->"+i+"j--->"+j+"K--->"+k);
				   k++;
				   count++;
				} while(k<5);
			}
			
			i++;
		}

	}

}

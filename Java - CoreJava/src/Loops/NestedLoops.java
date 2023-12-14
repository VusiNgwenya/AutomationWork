package Loops;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int k=0;
		
		while(i<3)
		{
			for(int j=0;i<4;j++)
			{
				do {
					System.out.println("i--->"+i+"j--->"+j+"k--->"+k);
				}while(k<5);
			}
		}

	}

}

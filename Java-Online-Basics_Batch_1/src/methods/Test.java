package methods;

import java.util.Scanner;

public class Test
{
	int i=10;

	public static void main(String[] args)
	{
		Test obj = new Test();
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		System.out.println("Please enter first integer value and then press Enter key:");
		int b = scan.nextInt();
		System.out.println("Please enter second integer value:");
		
		int result = obj.addTwoValues(100,250);
		
	}
	
	public int addTwoValues(int var1,int var2)
	{
		int sum = var1 + var2;
		
		//System.out.println(sum);
		
		return sum;
	}
	
	public void printAdditionResult(int a)
	{
		System.out.println(a);
	}
}

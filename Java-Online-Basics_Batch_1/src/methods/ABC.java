package methods;

public class ABC {
	
	public static void main(String[] args)
	{
		ABC obj = new ABC();
		int result = obj.add(10, 20);
		
		System.out.println(result);
		
	}
	
	public int add(int a,int b)
	{
		int sum = a+b;
		
		return sum;
	}

}

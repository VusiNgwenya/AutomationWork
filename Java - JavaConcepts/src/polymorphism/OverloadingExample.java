package polymorphism;

public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingExample obj = new OverloadingExample();
		obj.doLogin("asfssfsfsfsf", "fddfgfgffff");
		
		obj.add(1, 2);
		
		byte  b1 = 10;
		byte  b2 = 20;
		
		//obj.add(b1, b2);
		
		obj.addition(10,10,20,30);
		
		System.out.println(obj);
		
	}
	
	public void addition(int... a)
	{
		int[] var = a;
	}
	
	public void add(int a,int b)
	{
		
	}
	
	public void add(int a, double var)
	{
		
	}
	
	public int add(int a,int b,int c)
	{
		return 10;
	}
	
	public void add(double var,int a)
	{
		
	}
	
	public void add(byte a, byte a)
	{
		
	}

	public void doLogin(String username,String password)
	{
		
	}
	
	public void doLogin(int mobileNumber,String password)
	{
		
	}
}

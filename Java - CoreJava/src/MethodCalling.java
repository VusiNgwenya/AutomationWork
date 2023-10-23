
public class MethodCalling 
{
	
	public static void main(String args)
	{
		MethodCalling m = new MethodCalling();
		m.go1();
		
		System.out.println("After calling go1 method");
		
		//m.go();
	}

	public static void go()
	{
		System.out.println("Inside Go Method");
		
		go1();
		go3();
	}
	
	public static void go1()
	{
		System.out.println("Inside Go1 Method");
		
		go2();
		
		System.out.println("After calling go1 method");
		
		
	}
	
	public static void go2()
	{
		System.out.println("Inside Go2 Method");
	}
	
	public static void go3()
	{
		System.out.println("Inside Go3 Method");
	}
}

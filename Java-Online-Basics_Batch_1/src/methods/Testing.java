package methods;

public class Testing {
	
	public static void main(String[] args)
	{
		Testing obj = returnObject();
		obj.add();
	}
	
	public static Testing returnObject()
	{
		Testing t = new Testing();
		return t;
	}
	
	public void add()
	{
		int sum = 10+20;
		System.out.println("Sum-->"+sum);
	}

}

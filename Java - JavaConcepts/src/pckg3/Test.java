package pckg3;

public class Test 
{

	public int publicVariable =10;
	public int privateVariable = 20;
	protected int protectedVariable =2;
	int defaultVariable = 40;
	
	public static void main(String[] args)
	{
		Test obj = new Test();
		
		System.out.println(obj.privateVariable);
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
		
		
	}
}


public class Calculator 
{

	Calculator()
	{
		System.out.println("Calling constructor");
	}
	
	public void add()
	{
		System.out.println("Adding some number");
	}
	
	public void sub()
	{
		System.out.println("Adding some numbers");
	}
	
	public void mult()
	{
		System.out.println("Multiply some numbers");
	}
	
	public void div()
	{
		System.out.println("Divide some numbers");
	}
	
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		
		calc.add();
		calc.sub();
		calc.div();
		calc.mult();
	}
}

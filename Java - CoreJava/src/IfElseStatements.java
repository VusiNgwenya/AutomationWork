
public class IfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*20);
		System.out.println(num);
		
		if(num >10)
		{
			System.out.println(num+" is Greater than 10");
		}
		else if(num>10 && num<15)
		{
			System.out.println(num+" between 10 and 15");
		}
		else
		{
			System.out.println(num+" is Less than 10");
		}

	}

}

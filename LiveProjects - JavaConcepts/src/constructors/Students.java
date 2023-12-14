package constructors;

public class Students {
	
	public Students(int i)
	{
		System.out.println(i);
	}
	
	String studentName;
	int rollNum;
	
	public Students(String studentName,int rollNum)
	{
		this(10);
		this.studentName = studentName;
		this.rollNum = rollNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}

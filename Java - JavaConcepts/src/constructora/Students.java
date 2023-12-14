package constructora;

public class Students {

	String studentName;
	int rollNum;
	
	public Students(String studentName,int rollNum)
	{
		
	}
	
	public Students(int i)
	{
		System.out.println(i);
	}
	//public 
	public Students Students(String studentName,int rollNum)
	{
		
		
		this.studentName = studentName;
		this.rollNum = rollNum;
		
	   return new Students(studentName,rollNum);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students st = new Students("Rahul",101);
		//Test t = new Test();
		System.out.println(st.studentName);
		System.out.println(st.rollNum);
		
				
	}

}

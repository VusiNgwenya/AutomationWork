
public class SingleTonTest {
	
	private static SingleTonTest instance = new SingleTonTest();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating Object");

	}
	
	public static SingleTonTest getInstance()
	{
		return instance;
	}

}

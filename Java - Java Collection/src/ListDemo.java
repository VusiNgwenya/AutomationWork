import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List li = new ArrayList();
		
		li.add(0,12);
		li.add(0,11);
		li.add(0,132);
		li.add(0,165);
		li.add(0,187);
		li.add(0,12);
		
		li.add(1,12);
		
		//li.addAll(1,12);
		
		li.remove(3);
		
		System.out.println(11);
		
		System.out.println("Index present at the 5th index");
		
		li.set(5, 122);
		
		System.out.println("After set operation: "+11);
		
		System.out.println(li.indexOf(li));
		System.out.println(li.lastIndexOf(li));
		

	}

}

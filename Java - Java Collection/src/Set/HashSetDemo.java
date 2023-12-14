package Set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hash = new HashSet<>();
		
		hash.add("Anshul");
		hash.add("Thakur");
		hash.add("Kronos");
		hash.add("New Dehli");
		hash.add("India");
		
		System.out.println(hash);
		
		hash.remove("India");
	}

}

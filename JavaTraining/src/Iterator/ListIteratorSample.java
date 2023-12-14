package Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		

		for(int i=0;i<10;i++)
			al.add(i);
		
		System.out.println("Elements of ArrayList: "+al);
		
		ListIterator itr= al.listIterator();
		
		
		while(itr.hasNext())
		{
			int i = (Integer) itr.next();
			
			System.out.print(i+ "");
			
			if(i % 2 == 0) {
				i++;
				itr.set(i);
			}
		}
		
		System.out.println();
		
		System.out.println("Elements after Modification: "+al);
	}

}

package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		for(int i=0;i<10;i++)
		al.add(i);
		
		System.out.println("Elements of ArrayList :"+al);
		
		Iterator itr = al.iterator();
		
		System.out.println("Starting Iterator");
		
		while(itr.hasNext())
		{
			int i= (Integer) itr.next();
			
			System.out.println(i+" ");
			
			if(i % 2 != 0)
				itr.remove();
			
			
		}
		
		System.out.println();
		
		System.out.println("Elements after remove operation: "+al);
		
		

	}

}

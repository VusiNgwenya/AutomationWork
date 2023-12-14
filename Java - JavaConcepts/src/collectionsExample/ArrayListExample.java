package collectionsExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		System.out.println(list);
		
	    System.out.println(list.size());
	     
	    list.add(10);
	    list.add("Raman");
	    list.add(10.25);
	    list.add('c');
	    list.add(true);
	    list.add(null);
	    list.add("Raman");
	    
	    System.out.println(list);
	    System.out.println(list.size());
	 
	    System.out.println(list.get(0));
	    System.out.println(list.get(3));
	    System.out.println(list.get(7));
	    
	    list.remove(5);
	    
	    /*for(int i=0;i<list.size();i++)
	    {
	    	System.out.println(list.get(i));
	    }*/
	    
	    /*(for(Object var : list)
	    {
	    	System.out.println(var);
	    }*/
	    
	    Iterator itr = list.iterator();
	    
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    
	    
	    
	}

}

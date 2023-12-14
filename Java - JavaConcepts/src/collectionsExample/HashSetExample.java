package collectionsExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet();
		
		set.add("Raman");
		set.add("Way2Automation");
		set.add("Selenium");
		set.add("Appium");
		set.add("Raman");
		
		System.out.println(set);
		
		for(int i=0;i<set.size();i++)
		{
			System.out.println();
		}
		
		for(String var : set)
		{
			System.out.println(set);
		}
		
		Iterator<String> itr = set.iterator();
		

		while(itr.hasNext())
		{
			String var = itr.next();
			
			if(itr.next().equals("Appium"))
			{
			     System.out.println(itr.next());
			}
		}
	}

}

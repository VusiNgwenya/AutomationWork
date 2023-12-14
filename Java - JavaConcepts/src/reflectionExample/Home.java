package reflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		
		Class clazz = t.getClass();
		
		System.out.println(clazz.getSimpleName());
		
		Constructor[] cons = clazz.getDeclaredConstructors();
		
		System.out.println(cons.length);
		
		
		/*Method[]  arrayofMethods =  clazz.getDeclaredMethods();
		
		System.out.println(clazz.getMethods().length);
		System.out.println(arrayofMethods.length);
		
		for(Method m : arrayofMethods)
		{
			System.out.println(m.getName()+"----Return Type is:  -----"+m.getReturnType());
			
			Parameter[] params = m.getParameters();
			
			for(Parameter param : params)
			{
				System.out.println(param.getName());
			}
		}*/

	}

}

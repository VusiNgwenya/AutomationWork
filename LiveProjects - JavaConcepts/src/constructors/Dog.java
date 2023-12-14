package constructors;

public class Dog extends Animal
{
    public Dog()
    {
    	System.out.println();
    }
    
    public void sound()
    {
    	super.sound();
    	System.out.println("Dog sound !!!");
    }
}

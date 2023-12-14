package Oops;

public class Cars {
	
	Cars()
	{
		System.out.println("Creating Constructor of car Class");
	}
	
	String name = "Car Segment";
	
	public final void setWheels()
	{
		System.out.println("Only 4 Wheels are allowed");
	}
	
	public void run()
	{
		System.out.println("Car is running");
	}

}

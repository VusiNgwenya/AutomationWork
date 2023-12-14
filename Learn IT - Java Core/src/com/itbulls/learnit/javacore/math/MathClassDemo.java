package com.itbulls.learnit.javacore.math;

public class MathClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.sqrt(-1));
		System.out.println(0 / 0.0);
		System.out.println((0 / 0.0) + 5);
		
		System.out.println(5 / 0.0);
		System.out.println(-5 / 0.0);
		
		System.out.println(Math.round(20.0 / 3.0));
		System.out.println(Math.round(20.0*100.0 / 3.0));
		
		System.out.println(Math.random());
		
		System.out.println((int)(Math.random()*100));
		System.out.println((int)(Math.random()*100)*100);
		
	}

}

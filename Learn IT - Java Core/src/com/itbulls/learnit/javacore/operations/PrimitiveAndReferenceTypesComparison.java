package com.itbulls.learnit.javacore.operations;

public class PrimitiveAndReferenceTypesComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("65 == 'A' :"+(65=='A'));
		
		Integer i = 128;
		Integer i2 = 128;
		
		System.out.println("i == 12"+(i==i2));
		
		Integer i3 = 127;
		Integer i4 = 127;
		
		System.out.println("i3 == i4 "+(i3==i4));
		
		Integer i5 = new Integer(127);
		Integer i6 = new Integer(127);
		
		System.out.println("i5 == i6"+(i5==i6));
		
		Integer i7 = Integer.valueOf(127);
	}

}

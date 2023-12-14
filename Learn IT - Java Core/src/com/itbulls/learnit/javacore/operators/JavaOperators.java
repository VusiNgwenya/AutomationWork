package com.itbulls.learnit.javacore.operators;

public class JavaOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=====  Unary Arithmetic Operators ====");
		
		int i = +10;
	    int i2 = -10;
	    int i3 = ++i;
	    int i4 = i++;
	    int i5 = --i;
	    int i6 = i--;
	    
	    System.out.println("i = "+i);
	    System.out.println("i2 = "+i2);
	    System.out.println("i3 = "+i3);
	    System.out.println("i4 = "+i4);
	    System.out.println("i5 = "+i5);
	    System.out.println("i = "+i);
	    
	    System.out.println();
	    
	    
	    System.out.println("==== Binary Arithmetic Operators ====");
	    
		int i7 = 10 + 1;
		int i8 = i7 -1;
		int i9 = i8 / 2;
		int i10 = i9 % 2;
		int i11 = 5 % 10;
		int i12 = i10 * 3;
		
		System.out.println("i7 = "+i7);
		System.out.println("i8 = "+i8);
		System.out.println("i9 = "+i9);
		System.out.println("i10 = "+i10);
		System.out.println("i11 = "+i11);
		System.out.println("i12 = "+i12);
		System.out.println("Hello"+"World"+"!");
		
		System.out.println();
		
		
        System.out.println("==== Retional Operators ====");
	    
		int i14 = 10;
		int i15 = 20;
	       
		
		System.out.println(i14== i15);
		System.out.println(i14 != i15);
		System.out.println(i14 > i15);

		System.out.println("Hello"+"World"+"!");
		
		System.out.println();
		
		
        System.out.println("==== Logical Operators ====");
	    
		
		System.out.println(false && (5/0 == 0));
		System.out.println(true || (5/0 == 0));
		System.out.println("!true =" + !true);
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println("4 | 5 = "+(4 | 5));
		System.out.println("4 ^ 5 = "+(4 ^ 5));
		
		System.out.println();
		
		System.out.println(" ~1 = "+~1);
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println((byte) 0b11111110);
		System.out.println((byte) 0b10000000);
		System.out.println((byte) 0b11000000);
		
		System.out.println("5 = "+0b101);
		System.out.println(" 5 >> 1 = "+(0b101 >> 1));
		System.out.println("5 in binary format ="+Integer.toBinaryString(5));
		System.out.println("2 in binary format ="+Integer.toBinaryString(2));
		

		System.out.println(" 5 = "+0b101);
		System.out.println(" 5 >>> 1 = "+(0b101 >>> 1));
		
		int negativeByteValue = 0b111111111111111111110000000000;
		
		System.out.println(" -128 = "+negativeByteValue);
		System.out.println(" -128 >>> 1 = "+(negativeByteValue >>> 1));
		System.out.println(" -128 >> 1 = "+(negativeByteValue >> 1));
		
		System.out.println(" 5 = "+0b101);
		System.out.println(" 5 << 1 "+(0b101 << 1));
		System.out.println(" 5 in binary format "+Integer.toBinaryString(5));
		System.out.println(" 5 in binary format "+Integer.toBinaryString(10));
		
		System.out.println("10 * 2 = 10 <<1 "+(10 << 1));
		System.out.println("10 * 2 = 10 <<1 "+(10 >> 1));
		
		System.out.println();
		
		
		System.out.println("==== ternary Operator ====");
		
		System.out.println(2 > 1 ?" 2 is greater than one ":"2 is not less than one");
		System.out.println(2 > 1 ?" 2 is greater than one ":"2 is not less than one");
		  
		  
	}

}

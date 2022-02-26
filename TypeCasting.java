package com.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		//implicit typecasting
		System.out.println("Implicit Typecasting");
		byte a=6;
		short b=a;
		int c=b;
		long d=c;
		float e=d;
	    
	    
	    double f=e;
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(e);
	    //Explicit Typecasting
	    System.out.println("Explicit Typecsating");
	    double g=45.67;
	    int h=(int)g;
	    short i=(short)h;
	    System.out.println(g);
	    System.out.println(h);
	    System.out.println(i);
	   

	}

}

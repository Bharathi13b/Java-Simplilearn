package com.exception;

public class Wrapper_Class {
	public static void main(String[] args) {
		int a=90;
		Integer b=new Integer(a);
		
		System.out.println(a);
		System.out.println(b);
		int c=b.intValue();
		System.out.println(c);
		
	}

}

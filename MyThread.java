package com.exception;
import java.lang.*;


	public class MyThread extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("thread using extends..");
	}
	 	public static void main( String args[] )
	 	{
	  		MyThread mt = new  MyThread();
	  		mt.start();
	 	}

}

package com.exception;


//public class MyRunnable {
	 public class MyRunnable implements Runnable
	 {
		 public void run()
		 {
			 System.out.println("using runnable interface..!" );
			
			 
		 }
		 public static void main(String[] args) {
			 MyRunnable m1=new MyRunnable();
			 Thread t1=new Thread(m1);
			 t1.start();
			
		}
	 }
		
			 
			   		
		 
	    
	



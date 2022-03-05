package com.customexception;

public class ThrowDemo {
	public static void main(String[] args)
    {

        int a=4,b=0,rs;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                rs = a / b;
                System.out.println("The result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.println(  Ex.getMessage());
        }

        System.out.print("programme end");
    }

}

package com.email;
import java.util.*;
import java.util.regex.*;


public class Email {
	public static void main(String[] args) {
		List<String>emails=new ArrayList<String>();
		//valid email address (emails.add("bharathi@.com"));
		
		//emails.add("ramya@gmail.com");
		//emails.add("pravallika@example.me.org");
		//invalid email addresses
		//emails.add("sushma.example.com");
		//emails.add("vani..rani@example.com");
		//
		emails.add("anusha@.example.com");
		for(String value:emails)
		{
			System.out.println("The Email address " +value+" is "+(isValidEmail(value)?"valid":"inavalid"));
			
		}
		System.out.println("Enter any email address to check");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The Email address"+input+"is"+(isValidEmail(input)?"valid":"invalid)"));
		
		
	}
	public static boolean isValidEmail(String email)
	{
		String regex="^(.+)@(.+)$";
		//intialize the pattern object
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		return matcher.matches();
	}
	
	

}

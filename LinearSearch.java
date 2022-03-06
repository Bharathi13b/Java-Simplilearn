package com.linearsearch;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {2,6,7,9,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key for linear search");
		int key=sc.nextInt();
		int result= linearSearch(arr,key);
		if (result==-1)
		{
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index"+result);
		}
		
	}
	public static int linearSearch(int arr[],int key)
	{
		int len=arr.length;
		int index=-1;
		for(int i=0;i<len;i++)
		{
			if(arr[i]==key)
			{
				index=i;
			}
			
	}
	
	return index;
	}
	

}



package com.selection;

public class BubbleSortDemo {
	public static void main(String[] args) {

		int arr[] = { 0, 7, 4, 3, 9, 18, 7,14,2 };

		bubbleSort(arr);

		System.out.println("Elements after BubbleSort");

		for (int element : arr) {

			System.out.print(element + " ");
		}

	}

	public static void bubbleSort(int[] arr){
	        int len = arr.length;
	        int temp = 0;
	        for(int i=0;i<len;i++){
	            for (int j=1;j<(len);j++){
	                if(arr[j-1]>arr[j]){
	                temp = arr[j-1];
	                arr[j-1]= arr[j];
	                arr[j]= temp;

	                }


	            }
	        }
	}
}

	        




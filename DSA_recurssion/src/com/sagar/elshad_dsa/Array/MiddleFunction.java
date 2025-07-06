package com.sagar.elshad_dsa.Array;

import java.util.Arrays;

public class MiddleFunction {

	 public static int[] middleFunction(int [] arr) {
		 int index=1;
		 if(arr.length <=2) return new int[0];
		 int [] myArray=new int[arr.length-2];
		 
		 while(index < arr.length-1) {
			 myArray[index-1]=arr[index];
			 index++;
		 }
		 return myArray;
	 }
	
	 public static void main(String[] args) {
		int [] arr=new int[] {1,2,3,4,5,6};
		System.out.println(Arrays.toString(middleFunction(arr)));
		System.out.println("hello");
		
	}
}

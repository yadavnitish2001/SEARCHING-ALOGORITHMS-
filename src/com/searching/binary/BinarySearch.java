package com.searching.binary;

import java.util.Scanner;

import com.searching.linear.LinearSearchApp;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size pf an array");
		int size=sc.nextInt();
		//creating an array
		int[]arr=new int[size];
		//Taking an input
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter the  "+(i+1)+"th element");
			arr[i]=sc.nextInt();
		}
		//Displaying the elements
		System.out.println("The elements are in arrays");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter the key elements to find in the array");
		int key=sc.nextInt();
		
		System.out.println(BinarySearchApp.binarysearch(arr,key));

	}

}

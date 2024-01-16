package com.searching.binary;

public class BinarySearchApp {
	public static String binarysearch(int arr[],int key) {
		int start=0;
		int end=arr.length;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
				if(arr[mid]==key) {
					return "key" +key+" is present at index "+mid;
				}
				if(arr[mid]<=key) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
		}
		return "key" +key+" is not present at index ";
	}

}

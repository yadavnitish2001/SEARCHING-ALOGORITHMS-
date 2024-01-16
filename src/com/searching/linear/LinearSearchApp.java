package com.searching.linear;

public class LinearSearchApp {
	public static String linearsearch(int[]arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return ("key"+key+" is present in array at index:"+i);
			}
		}
		return "key not found in array";
		
	}

}

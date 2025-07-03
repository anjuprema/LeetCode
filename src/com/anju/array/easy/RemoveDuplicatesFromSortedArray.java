package com.anju.array.easy;

import java.util.Arrays;

/**
 * Given an integer array nums in sorted order, remove the duplicates in-place 
 * such that each unique element appears only once. The relative order of the 
 * elements should be kept the same. Then return the number of unique elements in nums
 * 
 * Solution: 
 * Assume and set element in 1st place as it is in order
 * Traverse to find next non duplicate element
 * Place it in next position and increment position and reset number
 * At the end reset all spaces with zero
 * 
 * Time: O(n) — single pass
 * Space: O(1) — in-place, constant space
 * */
public class RemoveDuplicatesFromSortedArray {
	public static int[] arr = {1, 2, 3, 3, 4, 5, 5, 5, 6};
	public static void main(String[] args) {
		System.out.println("Before :"+ Arrays.toString(arr));
		int length = arr.length;
		int num = arr[0]; int position = 1;
		for(int i=1; i<length; i++) {
			if(arr[i] > num) {
				arr[position] = arr[i];
				num = arr[i];
				position++;
			}
		}
		
		for(int j=position; j<length; j++) arr[j] = 0;
		System.out.println("After :"+ Arrays.toString(arr));
	}

}

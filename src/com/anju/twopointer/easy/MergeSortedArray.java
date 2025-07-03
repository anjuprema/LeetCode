package com.anju.twopointer.easy;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * eg: Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output: [1,2,2,3,5,6] 
 * 
 * Time Complexity: O(n + m)
 * Space Complexity: O(1) (in-place)
 * */
public class MergeSortedArray {
	private static int[] arr1 = {8,9,10,11,12,0,0,0}; 
	private static int n = 5;
	private static int[] arr2 = {2,5,6}; 
	private static int m = 3;	
	public static void main(String[] args) {
		System.out.print("Trying to merge: "+ Arrays.toString(arr1));
		System.out.println(" and "+ Arrays.toString(arr2));
		int i = n-1; int j = m-1; int position = arr1.length-1;
		while(i>=0 && j>=0) {
			if(arr1[i] >= arr2[j]) {
				arr1[position] = arr1[i];
				i--;
			} else {
				arr1[position] = arr2[j];
				j--;
			}
			position--;
		}
		
		//if arr2 still has elements
		while(j >= 0) {
			arr1[position] = arr2[j];
			j--;
			position--;
		}
		
		// No need to copy remaining arr1 elements – they are already in place
		
		System.out.println(Arrays.toString(arr1));
	}
}

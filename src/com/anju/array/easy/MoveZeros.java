package com.anju.array.easy;

import java.util.Arrays;

/**
 * Given an Integer Array of num, move all 0's to end while maintaining the order of other elements
 * Note: Must not make copy of array. Must do in-place
 * 
 * Solution: Move all non-zero elements to one side and fill rest with zero
 * 
 * Time Complexity: 
 * 	1st loop loops n times -> O(n)
 * 	2nd loop loops n times -> O(n)
 * 	Total O(n) + O(n) = O(n)
 * 
 * Space Complexity: O(1)
 * No additional arrays, lists, or data structures used.
 * Only a few int variables like insertPos → constant space.
 * So space complexity is O(1) (constant space).
 * 
 * PS: Even if u allocate 1000 constant variables like insertPos, space complexity is still O(1)
 * But if you allocate space depending on input size n, e.g. new int[n], then it becomes O(n).
 **/
public class MoveZeros {	
	private static int[] arr = {3,0,8,0,6,0,0,9};
	public static void main(String[] args) {		
		System.out.println("Before: "+Arrays.toString(arr));
		
		int insertPos = 0;
		for(int num: arr) {	
			if(num != 0) {
				arr[insertPos] = num;
				insertPos++;
			}
		}
		
		while(insertPos < arr.length) {
			arr[insertPos] = 0;
			insertPos++;
		}
		
		System.out.println("After: "+Arrays.toString(arr));
	}

}

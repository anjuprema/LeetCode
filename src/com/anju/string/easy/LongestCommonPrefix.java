package com.anju.string.easy;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix amongst an array of strings
 * If no common prefix return an empty string ""
 * eg: String[] str1 = {"flower", "flow" , "flight"} -> "fl"
 *     String[] str2 = {"car", "camel" , "kettle"} -> ""
 *     
 * Solution: Brute Force Approach is not optimized (checking all items for all possible prefix till we find the longest prefix)
 * Better Solution: 
 * 	Sort array first and compare only first element to the last element 
 *  Increment i till the chars matches and return when a non match occurs
 * 
 * Time Complexity: O(n log n) due to sorting + O(m) to compare first and last strings, 
 * 		where n = number of strings, m = length of shortest string.
 * Space: O(1) additional space (ignoring input/output arrays)
 * 
 * Best Solution for Performance: Non-sorting (vertical scanning) approach is better due to no-sort
 * 	For each character of 1st element in array, check whether all other elements is having same char at the same position
 * 
 * Time: O(n × m), where n = number of strings, m = length of the shortest string
 * Space: O(1), constant extra space
 * */
public class LongestCommonPrefix {
	private static String[] arr1 = {"flower", "flow" , "flight"};
	private static String[] arr2 = {"camel", "camel" , "camel"};
	private static String[] arr3 = {"carrot", "cartoon" , "kettle"};
	
	public static String longestPrefixBySorting(String[] arr) {
		if(arr == null || arr.length == 0) return "";
		
		//Sort array first
		Arrays.sort(arr);
		int i = 0; 
		int smallestStrLength = Math.min(arr[0].length(), arr[arr.length-1].length());
		while(i<smallestStrLength && arr[0].charAt(i) == arr[arr.length-1].charAt(i)) {
			i++;
		}
		return arr[0].substring(0, i);
	}
	
	public static String longestPrefixVerticalScan(String[] arr) {
		if(arr == null || arr.length == 0) return "";
		
		for(int i=0; i<arr[0].length(); i++) {
			char ch = arr[0].charAt(i);
			for(int j=1; j<arr.length; j++) {
				if(i >= arr[j].length() || arr[j].charAt(i) != ch) {
					return arr[0].substring(0, i);
				}
			}
		}
		return arr[0];
	}
	
	public static void main(String[] args) {
		System.out.print("Longest Prefix of "+ Arrays.toString(arr1) + " -> ");
		System.out.println(longestPrefixVerticalScan(arr1));
		System.out.print("Longest Prefix of "+ Arrays.toString(arr2) + " -> ");
		System.out.println(longestPrefixVerticalScan(arr2));
		System.out.print("Longest Prefix of "+ Arrays.toString(arr3) + " -> ");
		System.out.println(longestPrefixVerticalScan(arr3));
	}
}

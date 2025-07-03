package com.anju.string.easy;
/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by 
 * deleting some (can be none) of the characters without disturbing the relative positions 
 * of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * 
 * Solution: 
 * Keep 2 pointers i & j each on mainString and subString starting from 0th position
 * Loop through each characters of substring to find the character in mainString.
 * On finding the char subString pointer is incremented, 
 * mainString character is incremented even if found or not
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * */
public class IsSubSequence {
	private static String mainString = "abcdef";
	private static String subString = "ace";
	public static void main(String[] args) {
		int i = 0; int j = 0;
		while(j < mainString.length() && i < subString.length()) {
			char letter = subString.charAt(i);
			if(mainString.charAt(j) == letter) {				
				i++;
			}
			j++;
		}
		if(i == subString.length()) {
			System.out.println("Is a sub sequence");
		} else {
			System.out.println("Is not a sub sequence");
		}
	}
}

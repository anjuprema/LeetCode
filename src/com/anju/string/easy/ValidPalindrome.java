package com.anju.string.easy;
/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters, it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * String str = "A man, a plan, a canal: Panama" -> "amanaplanacanalpanama" -> is Palindrome 
 * String str = "race a car" -> "raceacar" ->  is not Palindrome
 * 
 * Solution: 2 pointer approach
 * One pointer starts from start of string
 * Second pointer starts from end of string
 * Pointers are progressed till alphabets are reached
 * Characters at pointers are compared if they are same till middle of the string is reached
 * 
 * Time Complexity: O(n) – Each character is visited at most once.
 * Space Complexity: O(1) – No additional space used.
 * 
 * */
public class ValidPalindrome {
	private static String str1 = "A man, a plan, a canal: Panama";
	private static String str2 = "race a car";
	
	private static boolean isPalindrome(String str) {
		int length = str.length();
		for(int i=0,j=length-1; i<j; i++,j--) {
			while(i<j && !Character.isAlphabetic(str.charAt(i))) {
				i++;
			} 			
			while(j>i && !Character.isAlphabetic(str.charAt(j))) {
				j--;
			} 
			if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
				return false;
			}			
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(str1 + " -> Is Palindrome? ->" + isPalindrome(str1));
		System.out.println(str2 + " -> Is Palindrome? ->" + isPalindrome(str2));
	}
}

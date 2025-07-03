package com.anju.array.easy;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and 
 * choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
 * Input: prices = [7,19,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * 
 * Solution: 
 * Initially set 1st item as best buy and maxProfit as 0
 * Traverse through each element to calculate maxProfit, if a better profit then maxProfit is reset
 * If a better buy found, then buy is reset
 * 
 * Time Complexity: single pass O(n)
 * Space Complexity: constant space O(1)
 * */
public class BesttimeToBuyAndSellStock {
	private static int[] arr = {7, 14, 1, 5, 3, 6, 4};
	public static void main(String[] args) {
		int buy = arr[0];
		int maxProfit = 0;
		int length = arr.length;
		
		for(int i=1; i<length; i++) {
			int currentProfit = arr[i] - buy;
			
			if(buy > arr[i]) {
				buy = arr[i];
			} 
			
			if(currentProfit > maxProfit) {
				maxProfit = currentProfit;
			}
		}
		System.out.println("MaxProfit ->"+ maxProfit);
	}
}

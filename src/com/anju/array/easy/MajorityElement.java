package com.anju.array.easy;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than n/2 times. 
 * Note: You may assume that the majority element always exists in the array.
 * 
 * Solution: Using HashMap we can count occurrence and determine the majority element.
 * But the complexity is O(n) due to HashMap creation
 * 
 * Boyer Moore Algorithm helps attain with complexity of O(1)
 * Keep a variable for item (initially set to start element)
 * Keep another variable for count
 * Each time you see same element you increment count
 * Each time time you see a different element you decrement the count
 * When count reaches zero, reset with new element
 * */
public class MajorityElement {
	private static int[] arr = {2,2,2,2,1,1,2,2,1,2,1,1};
	public static void solutionUsingHashMap() {
		int length = arr.length;
		HashMap<Integer, Integer> hm = new HashMap();
		
		for(int i=0; i<length; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		
		int maxValue = 0; int maxKey=0;
		for(Entry<Integer, Integer> entry: hm.entrySet()) {
			if(entry.getValue() > maxValue) {
				maxKey = entry.getKey();
				maxValue = entry.getValue();
			}
		}
		System.out.println("Majority Element ->" + maxKey + " , is repeated " + maxValue + " times");
	}
	public static void main(String[] args) {
		// time complexity of O(n) due to hashmap creation
		solutionUsingHashMap(); 
		
		//Solution using Boyer Moore Algorithm with Time Complexity O(1)
		int majorityElement = arr[0];
		int majorityCount = 1;
		int length = arr.length;
		for(int i=1; i<length; i++) {
			if(arr[i] == majorityElement) {
				majorityCount++;
			} else {
				if(majorityCount !=0) {
					majorityCount--;
				} else {
					majorityElement = arr[i];
					majorityCount = 1;
				}
			}
		}
		
		System.out.println("Majority Element ->" + majorityElement);
	}

}

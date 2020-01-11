package com.rakuten.prj.util;

/**
 * 
 * @author shalini
 *
 */
public class ArrayUtil {
	/**
	 * 
	 * @param data
	 * @return
	 */
	public static int getSum(int[] data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++)
			sum += data[i];
		return sum;
	}

	/**
	 * 
	 * @param data
	 * @param no
	 * @return
	 */
	public static int getoccurence(int[] data, int no) {
		int res = 0;
		for (int i = 0; i < data.length; i++)
			if (no == data[i])
				res++;
		return res;
	}
	/**
	 * 
	 * @param items
	 */
 public static void sort(Comparable[] items) {
	for(int i = 0; i < items.length; i++) {
		for(int j = i+1; j < items.length; j++) {
			if(items[i].compareTo(items[j]) > 0) {
				Comparable temp = items[i];
				items[i] = items[j];
				items[j] = temp;
			}
		}
	}
 }
 }



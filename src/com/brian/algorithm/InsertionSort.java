package com.brian.algorithm;

import java.util.Arrays;

/*
 * InsertionSort Algorithm
 * ::pseudo code::
 * for i=1 to n-1
 * 	j=i
 * 	while(j>0 && A[j-1] > A[j])
 * 		swap(j-1, j)
 * 		j--
 */

public class InsertionSort {
	int[] target;
	int count = 0;
	
	public InsertionSort(int[] array) {
		this.target = new int[array.length];
		System.arraycopy(array, 0, this.target, 0, array.length);
	}
	
	public void sort() {
		System.out.println("before = " + Arrays.toString(target));
		for (int i = 1; i < target.length; i++) {
			int j = i;
			
			while(j > 0 && target[j-1] > target[j]) {
				count++;
				swap(j-1, j);
				j--;
			}
		}
		System.out.println("after = " + Arrays.toString(target) + ", count = " + count);
	}
	
	private void swap(int left, int right) {
		int temp;
		temp = target[left];
		target[left] = target[right];
		target[right] = temp;
		count++;
	}
}

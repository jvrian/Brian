package com.brian.algorithm;

import java.util.Arrays;

/*
 * BubbleSort Algorithm
 * ::pseudo code::
 * for i = (n-1) to 1
 * 	for j = 0 to (i-1)
 * 		if (A[j] > A[j+1])
 * 			swap(A[j], A[j+1])
 */

public class BubbleSort {
	int[] target;
	int count = 0;
	
	public BubbleSort(int[] array) {
		this.target = new int[array.length];
		System.arraycopy(array, 0, this.target, 0, array.length);
	}
	
	public void sort() {
		System.out.println("before = " + Arrays.toString(target));
		for (int i = target.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				count++;
				if (target[j] > target[j+1]) {
					swap(j, j+1);
				}
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

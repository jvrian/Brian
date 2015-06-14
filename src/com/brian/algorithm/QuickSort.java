package com.brian.algorithm;

import java.util.Arrays;

/*
 * QuickSort Algorithm
 * ::pseudo code::
 * partition(A, size)
 * 	if (size < 2) return
 * 	pivot = A[rand() % size]
 * 	L = 0, U = size - 1
 * 	while (L < U)
 * 		while(A[L] < pivot)
 * 			L++;
 * 		while(A[U] > pivot)
 * 			U--;
 * 		swap(A[L], A[U])
 * 	partition(A, L)
 * 	partition(&A[L+1], size - L - 1)
 */

public class QuickSort {
	int[] target;
	int count = 0;
	
	public QuickSort(int[] array) {
		this.target = new int[array.length];
		System.arraycopy(array, 0, this.target, 0, array.length);
	}
	
	public void sort() {
		System.out.println("before = " + Arrays.toString(target));
		partition(target, 0, target.length);
		System.out.println("after = " + Arrays.toString(target) + ", count = " + count);
	}
	
	private void partition(int[] array, int from, int to) {
		int left = from;
		int right = to - 1;
		int size = to - from;
		
		if (size < 2) return;
//		System.out.println("from A[" + left + "] = " + target[left] + " to A[" + right + "] = " + target[right]);
		int pivot = array[from + size / 2];
		
		while(left < right) {
			while(array[left] < pivot) {
				count++;
				left++;
			}
			while(array[right] > pivot) {
				count++;
				right--;
			}
//			System.out.println("===================swap===================");
//			System.out.println("pivot = " + pivot);
			swap(left, right);
//			System.out.println("==========================================");
		}
		
		partition(array, from, left);
		partition(array, left + 1, to);
	}
	
	private void swap(int left, int right) {
		int temp;
//		System.out.println(Arrays.toString(target));
//		System.out.println("swap " + target[left] + " and " + target[right]);
		temp = target[left];
		target[left] = target[right];
		target[right] = temp;
		count++;
//		System.out.println(Arrays.toString(target));
	}
}

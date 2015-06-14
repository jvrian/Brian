package com.brian.algorithm;

import java.util.Arrays;

/*
 * MergeSort Algorithm
 * ::pseudo code::
 * for i = 1; i < size; i = 2i
 * 	for j = 0; j < size - i; j = j + 2i
 * 		merge(&A[j], i, min(2i, size - j) 
 */

public class MergeSort {
	private int[] target;
	private int count = 0;
	
	public MergeSort(int[] array) {
		this.target = new int[array.length];
		System.arraycopy(array, 0, this.target, 0, array.length);
	}
	
	public void sort() {
		System.out.println("before = " + Arrays.toString(target));
		
		for (int i = 1; i < target.length; i = 2 * i) {
			for (int j = 0; j < target.length - i; j = j + 2 * i) {
				int mergeSize = Math.min(2 * i, target.length - j);
//				System.out.println("----------------- size " + i + " -----------------");
				merge(j, j + i, Math.min(j + 2 * i, target.length), mergeSize);
			}
		}
		
		System.out.println("after = " + Arrays.toString(target) + ", count = " + count);
	}
	
	private void merge(int firstFrom, int secondFrom, int secondEnd, int tmpSize) {
		int i = firstFrom;
		int end1 = secondFrom;
		int j = secondFrom;
		int end2 = secondEnd;
		int k = 0;
//		int[] a1 = new int[secondFrom - firstFrom];
//		System.arraycopy(target, firstFrom, a1, 0, secondFrom - firstFrom);
//		int[] a2 = new int[secondEnd - secondFrom];
//		System.arraycopy(target, secondFrom, a2, 0, secondEnd - secondFrom);
		int[] temp = new int[tmpSize];
//		System.out.println("a1 = " + Arrays.toString(a1));
//		System.out.println("a2 = " + Arrays.toString(a2));
		
		while (i < end1 && j < end2) {
			if (target[i] < target[j]) {
				temp[k] = target[i];
				i++;
			} else {
				temp[k] = target[j];
				j++;
			}
			k++;
			count++;
		}
		
		while (i < end1) {
			temp[k] = target[i];
			i++;
			k++;
			count++;
		}
		
		while (j < end2) {
			temp[k] = target[j];
			j++;
			k++;
			count++;
		}
		

//		System.out.println("temp = " + Arrays.toString(temp));
		
		System.arraycopy(temp, 0, target, firstFrom, tmpSize);
	}
}

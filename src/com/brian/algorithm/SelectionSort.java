package com.brian.algorithm;

import java.util.Arrays;

public class SelectionSort {
	private int[] target;
	private int count = 0;
	
	public SelectionSort(int[] array) {
		this.target = new int[array.length];
		System.arraycopy(array, 0, this.target, 0, array.length);
	}
	
	public void sort() {
		int minIndex;
		
		System.out.println("before = " + Arrays.toString(target));
		for (int i = 0; i < target.length - 1; i++) {
			minIndex = i;
			
			for (int j = i + 1; j < target.length; j++) {
				count++;
				if (target[j] < target[minIndex]) {
					minIndex = j;
				}
			}
			
			swap(i, minIndex);
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

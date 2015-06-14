package com.brian.problem;

public class StringPermutation {
	String target;
	
	public StringPermutation(String str) {
		this.target = str;
	}
	
	public void permutation() {
		permutation("", target);
	}
	public void permutation(String ans, String remain) {
		int n = remain.length();
		
		if (n == 0) {
			System.out.println(ans);
		} else {
			for (int i = 0; i < n; i++) {
				permutation(ans + remain.charAt(i), remain.substring(0, i) + remain.substring(i+1, n));
			}
		}
	}
}

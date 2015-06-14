package com.brian.problem;

public class StringQuestions {
	public static void generatePermutations(String str) {
		permutation("", str);
	}
	private static void permutation(String ans, String remain) {
		int n = remain.length();
		
		if (n == 0) {
			System.out.println(ans);
		} else {
			for (int i = 0; i < n; i++) {
				permutation(ans + remain.charAt(i), remain.substring(0, i) + remain.substring(i+1, n));
			}
		}
	}
	
	public static boolean isSubstring(String strA, String strB) {
		if (strA.length() > strB.length()) {
			return strA.contains(strB);
		} else {
			return strA.contains(strB);
		}
	}
	
	public static boolean isRotaion(String strA, String strB) {
		if (strA.length() != strA.length()) {
			return false;
		} else {
			return isSubstring(strA + strA, strB);
		}
	}
	
	public static boolean isPermutation(String strA, String strB) {
		if (strA.length() != strB.length()) {
			return false;
		} else {
			char[] charA = strA.toCharArray();
			char[] charB = strB.toCharArray();
			int[] charCount = new int[128];
			
			for (int i = 0; i < charA.length; i++) {
				charCount[charA[i]]++;	// Array의 index를 character로 쓸 수 있음
			}
			for (int j = 0; j < charB.length; j++) {
				charCount[charB[j]]--;
				if (charCount[charB[j]] < 0) {
					return false;
				}
			}
			
			return true;
		}
	}
}

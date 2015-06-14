package com.brian.problem;

public class StringRotation {
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
				charCount[charA[i]]++;
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

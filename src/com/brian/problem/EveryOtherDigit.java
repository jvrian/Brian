package com.brian.problem;

/*
 * 모든 짝수번째 숫자를 * 로 치환하시오.(홀수번째 숫자,또는 짝수번째 문자를 치환하면 안됩니다.) 로직을 이용하면 쉬운데 정규식으로는 어려울거 같아요.
 * Example: a1b2cde3~g45hi6 → a*b*cde*~g4*hi6
 * 출처: http://codingdojang.com/scode/428
 */

public class EveryOtherDigit {
	String oldSentence;
	StringBuilder newSentence;
	
	public EveryOtherDigit(String input) {
		this.oldSentence = input;
		this.newSentence = new StringBuilder(input);
	}
	
	public void changeCharacters() {
		for (int i = 0; i < oldSentence.length(); i++) {
			if ((i+1) % 2 == 0) {
				newSentence.setCharAt(i, '*');
			}
		}
		
		System.out.println("old = " + oldSentence);
		System.out.println("new = " + newSentence);
	}
}

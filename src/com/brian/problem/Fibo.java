package com.brian.problem;

import java.util.ArrayList;

/*
 * 1, 2, 3, 5, 8 ... 의 형태로 가는 피보나치 수열의 원소중, 특정 수보다 작으면서 짝수인 수들의 합을 구하는 코드를 작성하시오.
 * 출처 : http://thinkinginruby.com/2015/04/07/exodus-from-c/
 */

public class Fibo {
	private int limit;
	private ArrayList seq, even;
	private int sum = 0;
	
	public Fibo (int limit) {
		this.limit = limit;
		seq = new ArrayList();
		even = new ArrayList();
	}
	
	public void even_sum() {
		int first = 1;
		int second = 2;
		int next = first + second;
		
		while (next <= limit) {
			seq.add(new Integer(next));
			
			if (next % 2 == 0) {
				even.add(new Integer(next));
				sum += next;
			}
			
			first = second;
			second = next;
			next = first + second;
		}
		
		System.out.println("seq[] = " + seq);
		System.out.println("even[] = " + even);
		System.out.println("sum = " + sum);
	}
}

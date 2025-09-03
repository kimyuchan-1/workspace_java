package com.ruby.java.ch03제어문;

//import java.util.Iterator;

/*
 * 1~100 수열의 합 구하는 for 문 작성
 * int sum = 0;
 * for (;;) {
 *   sum += i;
 * }
 * sysout("sum = " + sum);
 */
public class 실습_3장_4_for_수열합 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			
		}
	System.out.println("1부터 100까지의 합은 "+sum+"입니다.");
	}
}

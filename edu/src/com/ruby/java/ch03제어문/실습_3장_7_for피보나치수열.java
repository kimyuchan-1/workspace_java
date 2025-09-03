package com.ruby.java.ch03제어문;

import java.util.Scanner;

/*
 * 피보나치 수열: 0 1 1 2 3 5 8 ...
 * int n = sc.nextInt(); //항의 수
 * int first = 0;
 * int second = 1;
 * sysout(first);
 * for (;;) {
 *    sysout(second)
 *    int next = first + second;
 *    first = second;
 *    second = next;
 * }
 * 
 */
public class 실습_3장_7_for피보나치수열 {
	public static void main(String[] args) {
		System.out.print("피보나치 수열의 항의 개수를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int second = 1;
		int n = sc.nextInt();
		System.out.println(first);
		for (int i = 1; i < n; i++) {
			System.out.println(second);
			int next = first + second;
			first = second;
			second = next;
		}
	sc.close();
	}
}

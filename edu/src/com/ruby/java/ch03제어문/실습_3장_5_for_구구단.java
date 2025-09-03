package com.ruby.java.ch03제어문;

import java.util.Scanner;

/*
 * 구구단 출력
 * int dan = sc.nextInt()
 * for(;;) {
 *     //3x1 = 3
 *     //3x2 = 6 등으로 출력
 * }
 * 
 */
public class 실습_3장_5_for_구구단 {
	public static void main(String[] args) {
		System.out.print("원하는 구구단의 숫자를 입력해주세요: ");
		Scanner sc =new Scanner(System.in);
		int dan = sc.nextInt();
		int result ;
		for (int i = 1; i < 10; i++) {
			result = dan * i;
			System.out.println(dan+"x"+i+" = "+result);
		}
	sc.close();
	}
}

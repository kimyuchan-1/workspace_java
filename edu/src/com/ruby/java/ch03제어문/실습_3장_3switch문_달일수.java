package com.ruby.java.ch03제어문;

import java.util.Scanner;

/*
 * 달의 일 수 계산
 * int month = sc.nextInt()
 * switch(month) { 
 *     case1:
 *     		break;
 *     case3:
 *         days=31;
 * }
 * 
 */
public class 실습_3장_3switch문_달일수 {
	public static void main(String[] args) {
		System.out.print("일 수를 알고 싶은 월을 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int days;
		switch(month) {
		case 2:
			System.out.print("해당 연도를 입력해주세요: ");
			int year = sc.nextInt();
			if (year % 4 == 0) {
				if (year % 100 == 0 && year % 400 != 0) {
					days = 28;
					System.out.println(year+"년"+month+"월의 일 수는 "+days+"일입니다.");
					break;
				} else {
					days = 29;
					System.out.println(year+"년"+month+"월의 일 수는 "+days+"일입니다.");
					break;
				}
			} else {
				days = 28;
				System.out.println(year+"년"+month+"월의 일 수는 "+days+"일입니다.");
				break;
			}

		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			System.out.println(month+"월의 일 수는 "+days+"일입니다.");
			break;
		default:
			days=31;
			System.out.println(month+"월의 일 수는 "+days+"일입니다.");
			break;
		}
	sc.close();
	}
}

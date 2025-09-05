package com.ruby.java.ch04배열;
/*
 * 배열 사용없이 변수 5개를 사용하여 5명 점수의 평균 구하기
 * int score1,score2,score3, score4, score5;
 */
public class 실습_4_1_변수들사용_답 {
	//5명 점수를 score1 등의 변수로 초기화: 49, 91, 87, 67, 73
	//최대 점수, 최소 점수, 평균 점수 계산하는 코드 구현
	
	// main 메서드를 생성
	public static void main(String[] args) {
		// 정수형 score1~5 변수 선언
		int score1 = 49;
		int score2 = 91;
		int score3 = 87;
		int score4 = 67;
		int score5 = 73;
		
		// 최대값 찾기
		int max = score1;
		if (max < score2)	max = score2;
		if (max < score3)	max = score3;
		if (max < score4)	max = score4;
		if (max < score5)	max = score5;
		System.out.println("Max:" + max);
		
		// 최소값 찾기
		int min = score1;
		if (min > score2)	min = score2;
		if (min > score3)	min = score3;
		if (min > score4)	min = score4;
		if (min > score5)	min = score5;
		System.out.println("Min:" + min);
		
		System.out.println("Avg:" + (score1+score2+score3+score4+score5)/5.0);
	}
	
}

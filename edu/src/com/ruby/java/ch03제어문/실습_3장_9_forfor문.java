package com.ruby.java.ch03제어문;
/*
 * 출력 형태를 다음과 같이 만들기 실습
 * 실습1:
 * $$$$$
 * $$$$
 * $$$
 * $$
 * $
 * 
 * 실습2: 정삼각형 형태로 출력하기
 * $$$$$$
 *  $$$
 *   $
 */
public class 실습_3장_9_forfor문 {
	public static void main(String[] args) {
//		실습1
		/*
		 * String s = "$"; for (int i = 5; i >= 1; i--) { for (int j = i; j >= 1; j--) {
		 * System.out.print(s); } System.out.println(); }
		 */
//		실습2
		/*
		 * String s = "$"; String b = " "; String a = ""; for (int j = 0; j<=2; j++) {
		 * if (j == 0) { System.out.print(a); } else { System.out.print(b); } for (int i
		 * = 6; i <= 1; i = i - 2*j) { System.out.print(s); } System.out.println(); }
		 */

		// 이중 for문을 사용하여 피라미드 패턴을 출력합니다.
        for (int i = 0; i < 3; i++) {
            // 첫 번째 for문: 공백을 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 두 번째 for문: 별표를 출력
            for (int k = 0; k < (3 - i) * 2 - 1; k++) {
                System.out.print("*");
            }

            // 한 줄의 출력이 끝난 후 줄바꿈
            System.out.println();
        }
	}
}
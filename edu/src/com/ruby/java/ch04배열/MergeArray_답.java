package com.ruby.java.ch04배열;

import java.util.Arrays;
import java.util.Random;

// 두 배열을 합치기
public class MergeArray_답 {

	public static void main(String[] args) {

		// 랜덤 입력 변수 설정
		Random random = new Random();
		
		// 배열은 선언 A[5], B[5], C[10]
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[10];
		int[] d = new int[10];
		
		// 랜덤으로 값 입력
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = random.nextInt(101);
			b[i] = random.nextInt(101);
		}
		System.out.println("A:" + Arrays.toString(a));
		System.out.println("B:" + Arrays.toString(b));
		
		// 앞뒤 합치기
		for(int i = 0 ; i < a.length ; i++) {
			c[i] = a[i];
		}
		for(int i = 0 ; i < b.length ; i++) {
			c[i+a.length] = b[i];
		}
		System.out.println("C:" + Arrays.toString(c));
		
		// 교차 합치기
		for(int i = 0 ; i < a.length ; i++) {
			d[2*i] = a[i];
			d[2*i+1] = b[i];
		}
		System.out.println("D:" + Arrays.toString(d));
	}
}










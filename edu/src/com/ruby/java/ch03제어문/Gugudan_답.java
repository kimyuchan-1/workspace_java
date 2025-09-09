package com.ruby.java.ch03제어문;

public class Gugudan_답 {

	public static void printVertical() {
		for(int i = 2 ; i <= 9 ; i++) {
			System.out.println(i + "단");
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + " * " + i + " = " + (i * i));
			}
		}
	}

	public static void printHorizontal() {
		for (int i = 0 ; i <= 9 ; i++) {
			for (int j = 2 ; j <= 9 ; j++) {
				if (i == 0) {
					System.out.print(j + "단\t\t");
				}
				else {
					System.out.print(j + " * " + i + " = " + (j * i)+ "\t");
				}
			}
			System.out.println();
		}
	}

	public static void printColumn(int col) {
		if (col < 1 || 9 < col) {
			System.out.println("col is not valid![1~9]");
			return;
		}

		for(int i = 2 ; i < 10 ; i+=col) {
			for(int j = 0 ; j < 10 ; j++) {
				for (int k = 0 ; k < col ; k++) {

					if (10 <= i+k) {
						System.out.print("\n");
						break;
					}
					if (j == 0) {
						System.out.print((i+k) + "단\t");
					}
					else {
						System.out.printf("%d * %d = %d", (i+k), j, (i+k)*j);
					}
					if (k < col-1)	System.out.print("\t");
					else			System.out.print("\n");
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		printVertical();
		System.out.println("-".repeat(80));
		printHorizontal();
		System.out.println("-".repeat(80));
		printColumn(3);
	}
}



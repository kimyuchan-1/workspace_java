package edu;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'A';
		char[] alpha = new char[26];
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char)(letter + i);
		}
		for (char c : alpha) {
			System.out.println(c);
		}
	}

}

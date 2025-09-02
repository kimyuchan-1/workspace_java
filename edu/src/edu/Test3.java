package edu;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age;
		short point;
		int price;
		long totalSales;
		// overflow: 저장할 수 있는 수를 넘어가는 경우 나타나는 오류
		age = 23;
		point = 32000;
		price = 3500000;
		totalSales = 2147483648L;
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSales);
		
	}

}

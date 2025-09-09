package com.ruby.java.ch06객체구현;

public class Armor {
	private String name;
	private int height;
	
	// getter - 게터, 값을 가져오는 method
	public String getName() { 
		return name;
	}

	// setter - 세터, 값을 설정하는 method
	public void setName(String value) { 
		name = value;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int value) {
		height = value;
	}
}

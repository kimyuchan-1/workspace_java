package com.ruby.java.ch08.innerClass;
/*
 * 익명 클래스 구현 실습 
 */

interface Messenger {
	String getMessage(); // 추상 메소드
	void setMessage(String msg );
}
class GMessenger implements Messenger {
	@Override
	public String getMessage() {
		return "phone";
	}
	@Override
	public void setMessage(String msg) {
		System.out.println("메시지: " + msg);
	}
	void Change() {
		System.out.println("changed");
	}
}
public class MessengerTest {
	public static void main(String[] args) {
		GMessenger g = new GMessenger();
		g.getMessage();
		g.setMessage("hello");
		g.Change();

		//인터페이스를 구현한 클래스가 만들어지고 이것이 익명 클래스이다
		Messenger test = new Messenger() {//이름 없는 클래스가 상속받은 객체
			// java 컴파일러가 new (XXX(Class) implements) Messenger()를 추가하여 새로운 이름 없는 클래스를 정의 -> 익명 클래스
			// 익명 클래스 - 익명 객체 - 익명 함수: 간결한 코딩을 위한 중요한 포인트, 이후 lambda식에서 사용
			@Override
			public String getMessage() {
				return "익명클래스";
			}
			@Override
			public void setMessage(String msg) {
				System.out.println("익명클래스 메시지: " + msg);
			}
		};
		System.out.println("익명:: " + test.getMessage());
		test.setMessage("nice");
	}



}

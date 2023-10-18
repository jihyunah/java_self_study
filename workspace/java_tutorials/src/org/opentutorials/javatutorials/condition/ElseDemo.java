package org.opentutorials.javatutorials.condition;

public class ElseDemo {

	public static void main(String[] args) {
		if (false) { //true니까 조건절이 실행됨.
			System.out.println(1);
		} else if (true) {
			System.out.println(2); //if 문 안에서 처음 만난 true 가 실행되면 if문 전체는 중단된다.
		} else if (true) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

}

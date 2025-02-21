package chapter05_01;

//public class Penguin extends Bird, Swim { 다중상속이 안되서 오류
//인터페이스 다중상속 가능 implements사용
public class Penguin extends Bird implements Swim2 {

	@Override
	public void swim() {
		System.out.println("penguins swim.");
	}
//	public void swim() {
//		System.out.println("penguins swim.");
//	}
}
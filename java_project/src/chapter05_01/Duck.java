package chapter05_01;

//인터페이스 다중상속
public class Duck extends Bird implements Swim2, Fly {
	@Override
	public void swim() {
		System.out.println("ducks swim.");
	}

	@Override
	public void fly() {
		System.out.println("ducks fly.");
	}
}
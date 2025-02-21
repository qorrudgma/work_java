package chapter05_01;

abstract class Bird extends Animal {
	public int wing = 2;

	public void walk() {
		System.out.println("walk");
	}

	public void eat() {
		System.out.println("eat");
	}
}
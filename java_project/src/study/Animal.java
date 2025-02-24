package study;

abstract class Animals{
	String name;
	public Animals(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public abstract String sound();
}
class Dog extends Animals{
	public Dog(String name) {
		super(name);
	}

	@Override
	public String sound() {
		String a="멍멍";
		return a;
	}
}

public class Animal {
	public static void main(String[] args) {
		Animals animal=new Dog("강아지");
		String dog=animal.getName();
		System.out.println(dog+": "+animal.sound());
	}
}
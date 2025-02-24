package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		Object box2 = new Box();
		box.set("홍길동");
		// down casting string으로
		String name = (String) box.get();
		System.out.println(name);

		box.set(777);
		int num = (int) box.get();
		System.out.println(num);

		box.set(new Apple());
		Apple apple = (Apple) box.get();
		System.out.println(apple);

	}
}
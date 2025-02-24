package chapter07;

public class BoxExample2 {
	public static void main(String[] args) {
		// 제네릭 타입파라미터: String
		// Box 파일의 T가 String이된다
//		Box2<String> box1 = new Box2<String>();
		Box2<String> box1 = new Box2<>();
		box1.setT("hello");
//		box1.setT(777); // 오류
		String greet = box1.getT();
		System.out.println(greet);

		Box2<Integer> box2 = new Box2<>();
		box2.setT(777);
//		int num = box2.getT();
//		System.out.println(num);
		int value = box2.getT(); // auto unboxing
		System.out.println(value);

	}
}
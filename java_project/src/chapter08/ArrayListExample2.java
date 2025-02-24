package chapter08;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		// ArrayList 클래스타입으로 ArratList 클래스로 객체 생성(제네릭 타입파라미터를 String)
		ArrayList<String> array = new ArrayList<>();
		boolean aaa = array.add("oracle"); // ArrayList에서 add의 리턴타입은 boolean 참거짓으로 나온다
		System.out.println(aaa);

		boolean bbb = array.add("mtsql");
		System.out.println(bbb);

		boolean ccc = array.add("oracle"); // 중복가능
		System.out.println(ccc);

		System.out.println();
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.println(i + ": " + str);
		}

	}
}
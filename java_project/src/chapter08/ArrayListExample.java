package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// List 컬렉션에서 ArratList 클래스로 객체 생성(제네릭 타입파라미터를 String)
		List<String> list = new ArrayList<>(); // upcasting

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
//		list.add("Datavase");
		list.add(2, "Datavase"); // 교체되는게 아니라 사이에 추가
		list.add("Spring");

		int size = list.size();
		System.out.println("총 list 갯수: " + size);

		String skill = list.get(2);
		System.out.println("2번째 인덱스: " + skill);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}

		System.out.println();
		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}

		System.out.println();
		list.remove("Spring");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}

	}
}
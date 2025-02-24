package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		Set<AA> set = new HashSet<>();
//		Set<Object> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 추가 안됨
//		AA a = new AA();
//		set.add(a); // <Object>타입으로 사용가능
		set.add("iBatis");

		int size = set.size();
		System.out.println("총 객체 수: " + size);

		Iterator<String> iterator = set.iterator(); // set 컬렉션은 iterator 메소드 호출해서 iterator 인터페이스 타입으로 값을 받음
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.remove("JDBC");
		System.out.println("\n(삭제 후)총 객체 수: " + set.size());
//		Iterator<String> iterator2 = set.iterator();
//		while (iterator2.hasNext()) {
//			String element = iterator2.next();
//			System.out.println("\t" + element);
//		}
		for (String element : set) { // while보다 심플함
			System.out.println("\t" + element);
		}

		if (set.isEmpty()) {// 객체가 하나라도 있는지 확인
			System.out.println("\n비어 있음");
		} else {
			System.out.println("\n객체 있음");
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("\n(clear후)비어 있음");
		} else {
			System.out.println("\n(clear후)객체 있음");
		}

	}
}
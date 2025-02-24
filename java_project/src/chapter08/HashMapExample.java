package chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("임영웅", 31);
		map.put("영탁", 38);
		map.put("이찬원", 25);
		map.put("임영웅", 30);// 키는 중복안됨
		map.put("김호중", 38);// 값은 중복가능
		map.put("정동원", 25);

		System.out.println("임영웅: " + map.get("임영웅")); // Map.Entry 구조로 키/값 으로 구성
		System.out.println("\n총 Entry 수: " + map.size()); // Map.Entry 구조로 키/값 으로 구성

		// 키와 값을 출력하는 방법1
		Set<String> keySet = map.keySet(); // map 컬렉션의 모든 키들을 Set 컬렉션으로 받음
		Iterator<String> keyiterator = keySet.iterator();
		while (keyiterator.hasNext()) { // 컬렉션 객체가 있으면 참
			String key = keyiterator.next(); // 컬렉션 객체를 가져옴
			Integer value = map.get(key); // get() 메소드로 Map컬렉션의 키를 가지고 값을 가져옴
			// 출력 순서는 랜덤으로 발생됨
			System.out.println("\t" + key + ":" + value);
//			System.out.println("key: " + key);
//			System.out.println("value: " + value);
		}

		map.remove("임영웅");
		System.out.println("\n총 Entry 수: " + map.size()); // Map.Entry 구조로 키/값 으로 구성

		// Map.Entry 구조로 키/값 으로 객체를 받음
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// Set 컬렉션 방식으로 객체 처리(키,값을 가져옴)
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		// 키와 값을 출력하는 방법2
		while (entryIterator.hasNext()) { // 컬렉션 객체가 있으면 참
			Map.Entry<String, Integer> entry = entryIterator.next(); // 컬렉션 객체를 가져옴
			String key = entry.getKey(); // 키를 가져옴
			Integer value = entry.getValue(); // 값을 가져옴
			System.out.println("\t" + key + ":" + value);
		}

		map.clear();
		System.out.println("\n총 Entry 수: " + map.size());
	}
}
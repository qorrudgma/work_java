package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest3 {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println("\n-----------------");

		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println("\n-----------------");

		// 원본은 안바껴서 위에꺼가 바뀌는게 아니라 가장 처음에 만들어진 데이터에서 바뀐다
		sList.stream().map(s -> s.length()).forEach(s -> System.out.print(s + " "));
		System.out.println("\n-----------------");

		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.print(s + " "));
	}
}
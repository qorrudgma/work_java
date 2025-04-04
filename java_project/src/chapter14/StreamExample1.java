package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("입력데이터=" + numbers);
		List<Integer> result = numbers.stream() // 스트림 생성
				.filter(n -> { // filter 메소드로 짝수만 생성
					return n % 2 == 0;
				}).map(n -> { // map 메소드로 제곱
					return n * n;
				}).collect(Collectors.toList());
		System.out.println("실행결과=" + result);
	}
}
package chapter12;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] array = { 9, 4, 5, 6, 2, 1 };
		printArray(array);
		Arrays.sort(array);
		printArray(array);

		// 해당수를 탐색(인덱스 반환 못찾으면 음수(-1만이 아니라 음수 랜덤하게 나온다.))
		System.out.println(Arrays.binarySearch(array, 9));
		System.out.println(Arrays.binarySearch(array, 18));
		System.out.println(Arrays.binarySearch(array, 3));
		System.out.println(Arrays.binarySearch(array, 24));
		System.out.println(Arrays.binarySearch(array, 20));
		System.out.println(Arrays.binarySearch(array, 7));

		Arrays.fill(array, 8); // 배열을 특정한 값으로 채운다.
		printArray(array);

	}

	// 배열을 매개변수로 받아서 출력하는 매소드
	private static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");

	}
}
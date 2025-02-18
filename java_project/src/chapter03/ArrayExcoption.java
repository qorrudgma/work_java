package chapter03;

public class ArrayExcoption {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;
		try {
			for (int i = 0; i < intArray.length; i++) {
				intArray[i + 1] = intArray[i] + i + 1;
				System.out.println(intArray[i]);
			}
//		} catch (Exception e) {	예외처리 종류 상관없이 다 처리
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}
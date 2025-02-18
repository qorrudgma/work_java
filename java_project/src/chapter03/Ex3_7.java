package chapter03;

public class Ex3_7 {
	public static void main(String[] args) {

		int evens[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19 };

		// 배열 호출은 []생략 사용할때는 []추가

//		1.배열을 메소드 매개변수로 호출
//		5.합계를 받아서 evenSum에 저장
		int evenSum = sum(evens);
		int primesum = sum(primes);

//		6.evenSum출력
		System.out.println("짝수 배열의 합: " + evenSum);
		System.out.println("소수 배열의 합: " + primesum);

	}

//	2.arr로 evens를 받는다.
//	public static int sum(int arr[]) {
	public static int sum(int evens[]) {// 같은이름 사용해도 무관
//	public static int sum(int evens) {// 배열형식아니면 오류
		int sum = 0;
//		3.arr 배열원소를 가지고 반복해서 합계 구함
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
		for (int i = 0; i < evens.length; i++) {
			sum += evens[i];
		}
//		4.합계를 반환
		return sum;
	}
}
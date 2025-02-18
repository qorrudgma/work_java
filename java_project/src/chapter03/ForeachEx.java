package chapter03;

public class ForeachEx {
	// 열거형: inner class(내부 클래스)형태
	enum Week {
		월, 화, 수, 목, 금, 토, 일
	};

	public static void main(String[] args) {
		int number[] = { 1, 2, 3, 4, 5 };
		String name[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		int sum = 0;

		for (int num : number) {// number라는 배열의 요소들을 하나씩 순서대로 num이라 한다.
			sum += num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("합계: " + sum + "\n");

		for (String str : name) {// name라는 배열의 요소들을 하나씩 순서대로 str이라 한다.
			System.out.print(str + " ");
		}
		System.out.println("\n");

		for (Week day : Week.values()) {
//			String str = day; //열거형 값을 String 타입으로 받을수 없다.
			Week str = day;
			System.out.print(str + "요일 ");
		}
		System.out.println("\n");
	}
}
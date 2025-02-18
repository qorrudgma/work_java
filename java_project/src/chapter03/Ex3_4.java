package chapter03;

public class Ex3_4 {
	public static void main(String[] args) {
//		String 타입의 names 배열 선언
//		String[] names; 아래랑 이거랑 같음
//		String names[];
//		String names[] = { "Sam", "Kate", "John", "Jenny" }; // 배열 선언, 생성, 초기화 //인덱스는 3까지
//		String names[] = new String[5]; // String 배열 객체 생성 (공간을 만들었다 값들은 null)

//		String names[]; // 배열을 선언만함 그냥 배열이다라고만 한거 그래서 값을 확인하려하면 아예 안뜨고 오류남
//		names = new String[5]; // 여기서는[]안씀
//		names[0] = "aaa"; // 배열값(원소)할당

//		double names[];
//		names = new double[4];	//기본값 0.0

		int names[] = new int[4]; // 기본값 0

//		System.out.println(names); // [Ljava.lang.String;@1bc6a36e => 참조변수의 값
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	}
}
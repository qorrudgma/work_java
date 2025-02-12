package chapter02;

//jvm: 자바 가상기계
//1. jvm이 public class를 찾아감
//2. jvm이 main 메소드를 찾아감
public class HelloWord {
	public static void main(String[] args) {
//		String message;//변수선언
//		message = "헬로 월드!";//변수값 할당
		String message="헬로 월드!";//변수선언+초기화(한줄로 만듬)
		System.out.println(message);
		
		message = "웰컴 투헬!";//변수값 새로 할당
		System.out.println(message);
		
	}
}
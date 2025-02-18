package chapter02;

public class Square {
	public static void main(String[] args) {
		
		int n=4;
//		square();//메소드 호출부
//		int s = square();
		int s = square(n);
		System.out.println("한변의 길이가 " + n + "인 정사각형의 넓이: " + s);
			
	}
//	public static int(반환타입) square(메소드명)(int length(파라미터,매개변수,인자,입력변수)) {
//	void: 리턴타입x
//	public static void square() {
//	public static int square() { //void가 아니라서 return문 필요
	public static int square(int length) {
		int m = length*length;
//		return; //생략가능
		return m;//반환타입이랑 리턴타입이랑 같아야함
	}
//	아래처럼 짧게 가능
//	public static int square(int length) {
//		return length*length;
//	}
}
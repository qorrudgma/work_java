package chapter13;

interface Myfunction3 {
	void print();
}

public class LambdaEx3 {
	public static void main(String[] args) {
		Myfunction3 f = () -> {
			System.out.println("Heelo");
		};
		f.print(); // 람다식 호출(람다식 객체에서 print 메소드 호출)

		f = () -> {
			System.out.println("안녕"); // 람다식 재작성
		};
		f.print();
	}
}
package chapter03;

public class Calc {
	public static void main(String[] args) {// agrs: main 메소드 매개변수
		double sum = 0.0;

//		main 메소드 매개변수 크기만큼 반복
		for (int i = 0; i < args.length; i++) {
//			Double: Wrapper클래스
			sum += Double.parseDouble(args[i]);
		}
		System.out.println("합계: " + sum);
	}
}
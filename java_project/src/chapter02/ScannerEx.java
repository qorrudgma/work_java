package chapter02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.in : 바이트 표준 입력 스트림, 매개변수(인자, *파라미터*, argument)
		//sc : 참조 변수
		//Scanner  객체를 생성하고, Scanner 클래스 타입의 sc 참조변수가 가리킴
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble()                                                                                             ;
		boolean single  = sc.nextBoolean();
		
		//입력 받을때 스페이스나 탭으로 구분해서 토큰 단위로 받음
		System.out.println("이름은: " + name);
		System.out.println("도시: " + city);
		System.out.println("나이: " + age + "살");
		System.out.println("체중: " + weight + "kg");
		System.out.println("독신여부: " + single + "입니다.");
		
		//Scanner를 안닫으면 닫으라고 경고문이 뜬다 안닫아도 오류는 안뜸 그냥 경고
		sc.close();
	}
}

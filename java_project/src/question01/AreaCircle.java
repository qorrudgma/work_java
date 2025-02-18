package question01;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요>>");
		
		int r=sc.nextInt();
		float circleArea=r*r*3.14f;
		
		System.out.println("원의 면적은 " + circleArea + "입니다.");
		
		sc.close();
	}

}

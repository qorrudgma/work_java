package chapter03;

// 구구단을 배열로 만들기
// 값을 넣었을때 답 출력
public class Ex3_9 {
	public static void main(String[] args) {
		int gugudan[][] = new int[10][10]; // 정수타입으로 2차원 배열 생성

//		1*1=1 ~ 9*9=81
		for (int i = 1; i <= 9; i++) { // 행 기준
			for (int j = 1; j <= 9; j++) { // 열 기준
//				비어있는 원소: 0이 들어가있는 부분에는 비어있다 
				gugudan[i][j] = i * j;
			}
		}
		System.out.println("2 X 7 = " + gugudan[2][7]);
	}
}
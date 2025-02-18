package chapter02;

public class RandomNumber {

	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("주사위 의 눈: "+n);
		
	}
	public static int rollDie() {//매개변수가 없는 메소드
//		Math.random();//0~1사이 난수
		double x = 6 * Math.random();//6을 곱해서 0이상 6미만
		int temp = (int)x;//int로 바꿔서 소숫점 다 버림 0~5
		return (temp+1);
	}
}
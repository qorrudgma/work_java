package chapter02;

public class CircleArea {

	public static void main(String[] args) {

		double pi=3.14;
		int radius=10;
	 	double circleArea = pi*radius*radius;		//double이랑 int랑 계산한거라 double이 된거라서 int로 선언하면 오류뜸
	 	
	 	System.out.println(circleArea);
	}
}
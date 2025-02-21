package question06;

import java.util.Scanner;

public class Trapezoid {
	int down;
	int up;
	int height;

	public double getArea() {
//		double area = (down + up) * height / 2;
//		return area;
		return (down + up) * height / 2;
	}

	public static void main(String[] args) {
		Trapezoid trapezoid = new Trapezoid();
		Scanner sc = new Scanner(System.in);
		System.out.print(">>> ");
		trapezoid.down = sc.nextInt();
		trapezoid.up = sc.nextInt();
		trapezoid.height = sc.nextInt();
		System.out.println("사다리꼴의 면적은 " + trapezoid.getArea());

		sc.close();
	}

}

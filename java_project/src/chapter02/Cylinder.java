package chapter02;

import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r=7;
		double h=5;
		double v = volume(r, h);
		
		System.out.println("반지름이 "+ r +"높이가 "+ h +"인 원기둥의 부피: "+v);
	}
	//원기둥 부피 구하기
	public static double volume(double radius, double height) {
		return (Math.PI*radius*radius*height);
	}
}
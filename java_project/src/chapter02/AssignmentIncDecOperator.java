package chapter02;

public class AssignmentIncDecOperator {

	public static void main(String[] args) {

		int a=3, b=3, c=3;
		
		a+=3;	//a=a+3
		b*=3;	//b=b*3
		c%=2;	//c=c%2
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		
		int d=3;
		a=d++;	//a=d 를 하고 d=d+1
		
		System.out.println("a=" + a + ", d=" + d);
		
		a=++d;	//d=d+1을 하고 a=d
		System.out.println("a=" + a + ", d=" + d);
		
		a=d--;	//a=d 를 하고 d=d-1
		System.out.println("a=" + a + ", d=" + d);
		
		a=--d;	//d=d-1을 하고 a=d
		System.out.println("a=" + a + ", d=" + d);
	}
}
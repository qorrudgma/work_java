package package22;

import package21.A;

public class C {
	public static void main(String[] args) {
		A a = new A();

		a.field1 = 2;
//		a.field2 = 2; 	// default
//		a.field3 = 2;	// privare

		a.method1();
//		a.method2(); 	// default
//		a.method3();	// privare
	}
}
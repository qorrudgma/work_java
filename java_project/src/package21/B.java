package package21;

public class B {
	public static void main(String[] args) {
		A a = new A();

		a.field1 = 2;
		a.field2 = 2;
//		a.field3 = 2;	// privare

		a.method1();
		a.method2();
//		a.method3();	// privare
	}
}
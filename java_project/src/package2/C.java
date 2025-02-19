package package2;

// 다른 패키지있는거 사용하려면 inport를 사용
import package1.B;
//import package1.A;

public class C {
	B b;
	A a; // default라 다른패키지 사용못함
}
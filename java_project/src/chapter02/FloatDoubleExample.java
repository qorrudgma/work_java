package chapter02;

public class FloatDoubleExample {

	public static void main(String[] args) {

		float var1=3.14F;		//실수는 기본이 double이라서 float를 쓰려면 뒤에 f를 추가해준다
		float var2=3.14f;
		double var3=3.14;
		
		float var4=1.1234567891011121314151617181920F;		//오류는 안생기지만 출력할때 값이 짤려서 출력(반올림)
		double var5=0.1234567891011121314151617180920;		//float와 같지만 범위가 더 넓다(반올림)
		double var6=3e6;
		float var7=3e6F;
		float var8=2e-3F;
		double var9=2e-3;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("var9 : "+var9);
	}
}
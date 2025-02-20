package chapter05;

class Weapon {
	protected int fire() {
		return 1; // 기본 공격력:1
	}
}

class Cannon extends Weapon { // 탱크유닛
	@Override
	protected int fire() { //
		return 10; // 탱크 공격력:10
	}
}

public class Overriding {
	public static void main(String[] args) {
		// 이처럼 한번에 쓰는게 아닌 변수 선언을 따로 뺀다면(아래있음)
//		Weapon weapon = new Weapon();
//		System.out.println("기본 무기 공격력 -> " + weapon.fire());
//
//		Weapon weapon2 = new Cannon(); // 업캐스팅ㅡ
//		System.out.println("기본 무기 공격력 -> " + weapon2.fire());
		// ====================================================
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기 공격력 -> " + weapon.fire());

		weapon = new Cannon(); // 업캐스팅
		System.out.println("기본 무기 공격력 -> " + weapon.fire());
		// 이런식으로 하나만 만들어서 쓸수있음
	}
}
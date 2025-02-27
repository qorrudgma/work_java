package question10;

import java.util.Scanner;

class Member {
	private String id;
	private String name;
	private String area;

	public Member(String id, String name, String area) {
		this.id = id;
		this.name = name;
		this.area = area;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getArea() {
		return area;
	}
}

public class MemberAct {
	private Scanner sc;
	private Member[] mArr;

	public MemberAct() {
		sc = new Scanner(System.in);
	}

	void start() {
		System.out.println("====헬스클럽 회원관리 프로그램====");
		System.out.println("1.회원 정보 관리 | 2.프로그램 종료");
		System.out.println("==========================");
		System.out.print("메뉴를 선택하세요. >>> ");
		int num = sc.nextInt();
		if (num == 1) {
			member();
		} else if (num == 2) {
			end();
		}
	}

	private void end() {
		System.out.println("종료");
	}

	private void member() {
		System.out.println("\n=======일반회원 정보관리=======");
		System.out.println("11.일반회원 정보입력 | 22.일반회원 정보삭제 | 33.일반회우너 정보확인 | 0.이전단계");
		System.out.println("==========================");
		System.out.print("메뉴를 선택하세요. >>> ");
		int num = sc.nextInt();
		if (num == 11) {
			in();
		} else if (num == 22) {
			out();
		} else if (num == 33) {
			serch();
		} else if (num == 0) {
			start();
		}

	}

	private void in() {
		System.out.print("\n가입할 회원 수를 입력하세요>>");
		int num = sc.nextInt();
		mArr = new Member[num];

		for (int i = 0; i < mArr.length; i++) {
			System.out.println("\n회원정보를 입력하세요.");
			System.out.print("회원 아이디: ");
			String id = sc.next();
			System.out.print("회원 이름: ");
			String name = sc.next();
			System.out.print("회원 지역: ");
			String area = sc.next();
			mArr[i] = new Member(id, name, area);
		}
		member();
	}

	private void out() {
		System.out.print("\n삭제할 회원 번호를 입력하세요.");
		int num = sc.nextInt();
		for (int i = 0; i < mArr.length - 1; i++) {
			if (i >= num - 1) {
				mArr[i] = mArr[i + 1];
			}
		}

		for (int i = 0; i < mArr.length; i++) {
			System.out.println("\n회원 번호: " + (i + 1));
			System.out.println("회원 아이디: " + mArr[i].getId());
			System.out.println("회원 이름: " + mArr[i].getName());
			System.out.println("회원 지역: " + mArr[i].getArea());
		}
	}

	private void serch() {
		System.out.println("\n등록된 회원수는" + mArr.length + "명 입니다.");
		for (int i = 0; i < mArr.length; i++) {
			System.out.println("\n회원 번호: " + (i + 1));
			System.out.println("회원 아이디: " + mArr[i].getId());
			System.out.println("회원 이름: " + mArr[i].getName());
			System.out.println("회원 지역: " + mArr[i].getArea());
		}
		member();
	}

	public static void main(String[] args) {
		new MemberAct().start();
	}
}
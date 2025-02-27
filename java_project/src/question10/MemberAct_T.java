package question10;

import java.util.ArrayList;
import java.util.Scanner;

class Member_T {
	private String id;
	private String name;
	private String area;

	public Member_T(String id, String name, String area) {
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

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArea(String area) {
		this.area = area;
	}
}

public class MemberAct_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member_T> list = new ArrayList<>();

		int menu = 0;

		while (true) {
			System.out.println("====헬스클럽 회원관리 프로그램====");
			System.out.println("1.회원 정보 관리 | 2.프로그램 종료");
			System.out.println("==========================");
			System.out.println("메뉴를 선택하세요.>>>");
			menu = sc.nextInt();

			if (menu == 1) {
				while (true) {
					System.out.println("=======일반회원 정보관리=======");
					System.out.println("11.일반회원 정보입력 | 22.일반회원 정보삭제 | 33.일반회원 정보확인 | 0.이전단계");
					System.out.println("==========================");
					System.out.println("메뉴를 선택하세요.>>>");
					int menu1 = sc.nextInt();

					if (menu1 == 11) {
						System.out.print("\n가입할 회원 수를 입력하세요>>");
						int insertNum = sc.nextInt();

						for (int i = 0; i < insertNum; i++) {
							System.out.println("회원정보를 이력하세요.");
							System.out.println("회원아이디: ");
							String insertId = sc.next();
							System.out.println("회원이름: ");
							String insertName = sc.next();
							System.out.println("회원지역: ");
							String insertArea = sc.next();

							list.add(new Member_T(insertId, insertName, insertArea));
						}
					} else if (menu == 22) {
						System.out.print("\n삭제할 회원번호를 입력하세요>>");
						int removeNum = sc.nextInt();
						list.remove(removeNum - 1);

						for (int i = 0; i < list.size(); i++) {
							Member_T member = list.get(i);
							System.out.println("회원번호: " + (i + 1));
							System.out.println("회원아이디: " + member.getId());
							System.out.println("회원이름: " + member.getName());
							System.out.println("회원지역: " + member.getArea());
						}
					} else if (menu == 33) {
						System.out.print("등록된 회원수는 " + list.size() + "입니다.");
						for (int i = 0; i < list.size(); i++) {
							Member_T member = list.get(i);
							System.out.println("회원번호: " + (i + 1));
							System.out.println("회원아이디: " + member.getId());
							System.out.println("회원이름: " + member.getName());
							System.out.println("회원지역: " + member.getArea());
						}
					} else if (menu == 0) {
						break;
					}
				}
			} else if (menu == 2) {
				System.out.println("==========================");
				System.out.println("헬스클럽 회원관리 프로그램을 종료합니다.");
				System.out.println("==========================");
				break;
			}
		}
		sc.close();
	}
}
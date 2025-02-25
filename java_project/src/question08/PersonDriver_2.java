package question08;

import java.util.Scanner;

public class PersonDriver_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fname;
		String lname;
		Person_T person1, person2;

		System.out.println("성 입력:");
		lname = sc.next();
		System.out.println("이름 입력:");
		fname = sc.next();

		// person1
		person1 = new Person_T();
		person1.lastName = lname;
		person1.firstName = fname;
		System.out.println(
				"성: " + person1.getLastName() + "이름: " + person1.getFirstName() + "성명 길이: " + person1.getLength());

		// person2
		person2 = new Person_T();
		person2.lastName = lname;
		person2.firstName = fname;
		System.out.println(
				"성: " + person2.getLastName() + "이름: " + person2.getFirstName() + "성명 길이: " + person2.getLength());
		sc.close();
	}
}
package question08;

public class Student {
	public String Name;
	public int Number;
	public String Department;

	@Override
	public String toString() {
		return ("이름: " + Name + "\n학번: " + Number + "\n학과: " + Department);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

//	public void print() {
//		System.out.println("이름: " + Name);
//		System.out.println("학번: " + Number);
//		System.out.println("소속학과: " + Department);
//	}
}
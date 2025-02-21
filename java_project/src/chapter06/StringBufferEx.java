package chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);

		sb.append(" is pencil"); // append: 문자열 추가
		System.out.println(sb);

		sb.insert(7, " my"); // insert: 해당 인덱스 다음부터 문자열 추가
		System.out.println(sb);

		sb.replace(8, 10, "your"); // replace: 첫번째 인덱스부터 두번째 인덱스 전까지가 대체됨
		System.out.println(sb);

		sb.delete(8, 13); // delete: 첫번째 인덱스부터 두번째 인덱스 전까지가 삭제됨
		System.out.println(sb);

		sb.setLength(4); // setLength: 문자열의 길이를 해당수 만큼으로 바꿈(뒤는 다 날림)(인덱스 값이 아님)
		System.out.println(sb);
	}
}
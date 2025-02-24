package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample11 {
	public static void main(String[] args) throws Exception {
//		Writer: 문자 단위 출력을 위한 최상위 스트림 클래스
//		FileWriter: 문자 단위 출력을 위한 하위 스트림 클래스
		Writer writer = new FileWriter("C:/temp/output11.txt");
		char data[] = "홍길동1".toCharArray(); // 문자열을 문자 하나씩 배열로 가져온다.

		for (int i = 0; i < data.length; i++) {
			// writer 객체에서 writer 메소드로 "홍길동"을 하나씩받아서 파일로 저장한다.
			writer.write(data[i]);
		}

		writer.close();
	}
}
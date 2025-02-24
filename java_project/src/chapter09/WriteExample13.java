package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample13 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/temp/output13.txt");
		char data[] = "홍길동3".toCharArray();
//		writer.write(data);
		writer.write(data, 1, 2); // 인덱스 1번에서 2자를 읽어서 파일로 저장

		writer.close();
	}
}
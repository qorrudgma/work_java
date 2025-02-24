package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	// FileOutputStream: 바이트 단위 출력을 위한 하위 스트림 클래스
	// FileOutputStream output.txt를 가지고 객체 생성한다.
	public static void main(String[] args) throws Exception {
//		OutputStream os = new FileOutputStream("C:\\temp\\output.txt");
		OutputStream os = new FileOutputStream("C:/temp/output2.txt"); // \\두개 대신 /하나로 사용가능
		byte data[] = "ABC".getBytes(); // 문자열을 바이트 단위로 읽는다.

		for (int i = 0; i < data.length; i++) {
			// FileOutputStream 객체에 바이트 배열 원소를 넣는다.
			os.write(data[i]);
		}

		os.close();
	}
}
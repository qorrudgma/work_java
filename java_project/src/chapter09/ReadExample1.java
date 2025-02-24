package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	// throws Exception: 파일이 없을경우 예외 발생
	public static void main(String[] args) throws Exception {
//		InputStream: 바이트 단위 입력을 위한 최상위 스트림 클래스
//		FileInputStream: 바이트 단위 입력을 위한 하위 스트림 클래스
		InputStream is = new FileInputStream("C:\\temp\\test.txt"); // upcasting \는 특수 문자라 두개 적어야함
		int readByte;

//		while (true) {
//			readByte = is.read(); // byte 단위로 읽는다.(정수로 받음)
//			// 파일의 끝에는 -1이 존재(프로그래밍 언어 동일): EOF(end of file)
//			if (readByte == -1) {
//				break;
//			}
//			//System.out.println(readByte);// 숫자로 출력
//			System.out.print((char) readByte);// 문자로 출력
//		}

		while ((readByte = is.read()) != -1) {
			System.out.print((char) readByte);// 문자로 출력
		}
		is.close();
	}
}
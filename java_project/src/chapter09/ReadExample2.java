package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\temp\\test.txt"); // upcasting \는 특수 문자라 두개 적어야함
		int readByte;
		byte readBytes[] = new byte[3];
		String data = "";

		while (true) {
//			readByte = is.read(); // 1byte단위로 읽는다.(정수로 받음)
			readByte = is.read(readBytes); // 3byte단위로 읽는다.(정수로 받음)
			if (readByte == -1) {
				break;
			}
//			System.out.print((char) readByte); // 3byte 단위로 읽어서 형변환 하면서 오류나남;
			System.out.println("@#readByte=>" + readByte);
			data += new String(readBytes, 0, readByte);
		}
		System.out.println(data);

		is.close();
	}
}
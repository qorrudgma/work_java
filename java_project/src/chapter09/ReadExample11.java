package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:\\temp\\test.txt");
		int readData;
		char cbuf[] = new char[2];
		String data = "";

		while (true) {
			readData = reader.read(cbuf);// 2개의 문자 단위로 읽는다.
			if (readData == -1) {
				break;
			}
//			System.out.print((char) readData);
			System.out.println("@#readByte=>" + readData); // 2(a,a) 2(a,엔터) 2(첫줄,b) 2(b,엔터) 2(첫줄,c)
			data += new String(cbuf, 0, readData);
		}
		System.out.println(data);

		reader.close();
	}
}
package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/temp/output4.txt");
		byte data[] = "DEF".getBytes();
//			os.write(data);
		os.write(data, 0, 1);
		os.flush(); // 인터넷이 불안정한 상태에서 네트워크 끊겼을때 전송되지 못한 데이터를 보낸다.

		os.close();
	}
}
package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx1 {
	public static void main(String[] args) {
		Socket socket = null; // 클라이언트 소켓 선언
		BufferedReader in = null; // 입력: 클라이언트에서 들어오는 데이터
		BufferedWriter out = null; // 출력: 서버에서 보내는 데이터
		Scanner sc = new Scanner(System.in);

		try {
			// 서버ip와 포트를 가지고 소켓객체 생성
			socket = new Socket("192.168.10.30", 9999);
			System.out.println("연결을 기다리고 있습니다......");
//			socket = new Socket("192.168.10.32", 9999); 이컴
			// 입력: 클라이언트에서 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 출력: 서버에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				System.out.print("보내기>>");
				String outputMessage = sc.nextLine(); // 서버에서 보내는 메시지
				if (outputMessage.equals("bye")) { // 클라이언트 메시지가 bye일때
					out.write(outputMessage + "\n"); // 서버로 메시지 보내기
					out.flush();
					break;
				}
				out.write(outputMessage + "\n"); // 서버로 메시지 보내기
				out.flush();
				String inputMessage = in.readLine(); // 한행을 통으로 읽는다.
				System.out.println("서버: " + inputMessage); // 서버에서 온 메시지
			}
		} catch (Exception e) {
			e.printStackTrace(); // 예외처리시 시스템에서 자동으로 출력되는 메시지
		} finally {
			// 자원반납(예외발생까지 고려)
			try {
				sc.close();
				socket.close();
			} catch (Exception e2) { // 서버와 클라이엍느 간에 입출력시 예외 발생
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
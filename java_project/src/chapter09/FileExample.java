package chapter09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/aaa/bbb");
		File file1 = new File("C:/aaa/file1.txt");
		File file2 = new File("C:/aaa/file2.txt");
		File file3 = new File("C:/aaa/file3.txt");

//		dir.mkdir(); // 파일 만들기
		dir.mkdirs(); // 경로상의 파일들 없으면 전부 만들기
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();

		File test = new File("c:/aaa"); // 디렉토리 정보를 가지고 test 객체 생성
		File contents[] = test.listFiles();// 디렉토리 정보를 가지고 온다.(하위 디렉토리들+파이들)

		System.out.println("날짜\t\t시간\t형태\t크기\t이름");
		System.out.println("--------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm"); // 년워일 오전/오후 시분
		for (int i = 0; i < contents.length; i++) {
//			1740385749841: 1970년 1월 1일 기준으로 오늘 까지의 밀리세컨드로 계산된값(long type)
//			System.out.print(contents[i].lastModified());
//			System.out.print(new Date(contents[i].lastModified()));
			System.out.print(sdf.format(new Date(contents[i].lastModified())));
			if (contents[i].isDirectory()) {
				System.out.println("\t<DIR>\t\t" + contents[i].getName());
			} else {
				System.out.println("\t\t" + contents[i].length() + "\t" + contents[i].getName());
			}
		}
	}
}
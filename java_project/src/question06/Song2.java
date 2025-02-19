package question06;

import java.util.Scanner;

public class Song2 {
	private String title;
	private String artist;
	private int year;
	private String country;
	// 기본생성자 있어야하냐???

	public Song2(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("노래 제목>>");
		String scTitle = sc.next();
		System.out.print("가수>>");
		String scArtist = sc.next();
		System.out.print("발매 시기(년)>>");
		int scYear = sc.nextInt();
		System.out.print("국적>>");
		String scCountry = sc.next();
		Song2 s = new Song2(scTitle, scArtist, scYear, scCountry);

		s.show();
		sc.close();
	}
}
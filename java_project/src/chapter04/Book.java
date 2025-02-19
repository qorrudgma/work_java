package chapter04;

public class Book {
	String title;
	String author;

	public Book(String t, String a) {
		title = t; // 매개변수를 맴버 변수에 넣음
		author = a; // 매개변수를 맴버 변수에 넣음
	}

	public Book(String t) {
		title = t;
		author = "작자미상";
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐베리"); // littlePrince는 참조변수
		Book loveStory = new Book("춘향전"); // littlePrince는 참조변수

		System.out.println(littlePrince.title + " - " + littlePrince.author);
		System.out.println(loveStory.title + " - " + loveStory.author);
	}
}
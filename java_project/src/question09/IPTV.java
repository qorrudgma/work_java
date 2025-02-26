package question09;

public class IPTV extends ColorTV {
	private String s;
	int i;
	int j;

	private IPTV(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 31, 2048);
	}
}
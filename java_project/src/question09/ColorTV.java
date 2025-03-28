package question09;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

public class ColorTV extends TV {
	private int nColors;

	private ColorTV(int size, int nColors) {
		super(size);
		this.nColors = nColors;
	}

	private void printProperty() {
		System.out.println(getSize() + "인치 " + nColors + "컬러");
	}

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}
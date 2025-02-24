package chapter07;

//T = Tv, M = String
public class Product<T, M> {
	private T kind; // 3. new Tv()
	private M model;

	public T getKind() {// T = Tv가 메소드의 리턴 타입
		return kind;
	}

	// 1. Tv kind = new Tv()
	public void setKind(T kind) {// T = Tv가 매개변수의 타입
		this.kind = kind; // 2. new Tv()
	}

	public M getModel() {// M = String이 메소드의 리턴타입
		return model;
	}

	public void setModel(M model) {// M = String이 매개변수의 타입
		this.model = model;
	}
}
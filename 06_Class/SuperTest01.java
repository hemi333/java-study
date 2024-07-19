// import java.lang.Object;
// class Base extends Object { // 생략되어 있지만 Object가 default로 생성되어 있음

// 기본(부모) 클래스
class Base { // 생략되어 있지만 default로 생성되어 있음
	protected int x;

	public Base() {
		this.x = 1;
	}

	public Base(int x) {
		this.x = x;
	}

	public void print() {
		System.out.println("Base's x: " + x);
	}
}

// 파생(자식) 클래스
class Derived extends Base {
	private int x;

	public Derived(int x1, int x2) {
		// 권장방법
		// super(x1); // 부모의 x
		// this.x = x2; // 본인의 x
		super.x = x1;
		this.x = x2;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Derived's x = " + x);
	}
}

public class SuperTest01 {
	public static void main(String[] args) {
		Base a = new Base(10);
		a.print();
		System.out.println();

		Derived b = new Derived(20, 30);
		b.print();
		System.out.println();
	}
}

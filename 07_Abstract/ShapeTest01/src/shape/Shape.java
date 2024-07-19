package shape;

// 추상 클래스 - 부모 클래스
public abstract class Shape {

	// 추상 메서드
	public abstract void draw();

	// 추상 메서드
	public abstract String toString();

	// 비추상 메서드
	public void print() {
		System.out.println(toString());
		draw();
	}
}

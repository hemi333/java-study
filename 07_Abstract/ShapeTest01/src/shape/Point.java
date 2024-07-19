package shape;

// 자식 클래스 - 점 클래스
public class Point extends Shape {

	public Point() {

	}

	@Override
	public void draw() {
		System.out.println("*");
	}

	@Override
	public String toString() {
		return "Point";
	}
}

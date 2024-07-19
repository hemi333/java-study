package point;

public class Point2D {
	// 인스턴스 변수
	protected int x; // protected: 같은 패키지 안에서 사용 가능, 패키지가 달라도 상속을 받은 클래스에서는 사용 가능
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getter
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// setter
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// toString()
	public String toString() {
		// return "(" + x + ", " + y + ")";
		return String.format("(%d, %d)", x, y);
	}

}

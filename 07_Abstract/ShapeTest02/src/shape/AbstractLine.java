package shape;

// 자식 클래스 - Shape 클래스의 자식
// 부모 클래스 - HorizontalLine, VerticalLine의 부모 클래스
public abstract class AbstractLine extends Shape {
	private int length;

	public AbstractLine(int length) {
		this.length = length;
	}

	// getter
	public int getLength() {
		return length;
	}

	// setter
	public void setLength(int length) {
		this.length = length;
	}

}

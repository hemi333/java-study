package shape;

// ★얘 코드에는 추상메서드가 없어도 Shape를 상속받고 있기 때문에 추상메서드 2개를 갖고 있는 것임
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

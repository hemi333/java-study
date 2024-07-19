package shape;

// 자식 클래스 - AbstractLine의 자식 클래스, Shape의 손자 클래스
// 수직선 클래스
public class VerticalLine extends AbstractLine {

	public VerticalLine(int length) {
		super(length);
	}

	@Override
	public void draw() {
		for (int i = 0; i < getLength(); i++) {
			System.out.println("*");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return String.format("VerticalLine (length: %d)", getLength());
	}

}

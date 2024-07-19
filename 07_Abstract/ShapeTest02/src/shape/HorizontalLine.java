package shape;

// 자식 클래스 - AbstractLine의 자식 클래스, Shape의 손자 클래스
// 수평선 클래스
public class HorizontalLine extends AbstractLine {

	public HorizontalLine(int length) {
		super(length);
	}

	@Override
	public void draw() {
		for (int i = 0; i < getLength(); i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return String.format("HorizontalLine (lenght: %d)", getLength());
	}

}

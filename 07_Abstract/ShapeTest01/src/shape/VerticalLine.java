package shape;

public class VerticalLine extends AbstractLine {

	public VerticalLine(int length) {
		super(length);
	}

	@Override
	public String toString() {
		return String.format("VerticalLine (length: %d)", getLength());
	}

	@Override
	public void draw() {
		for (int i = 0; i < getLength(); i++) {
			System.out.println("*");
		}
		System.out.println();
	}
}

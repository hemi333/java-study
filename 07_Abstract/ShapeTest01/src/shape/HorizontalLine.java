package shape;

public class HorizontalLine extends AbstractLine {

	public HorizontalLine(int length) {
		super(length);
	}

	@Override
	public String toString() {
		return String.format("HorizontalLine (length: %d)", getLength());
	}

	@Override
	public void draw() {
		for (int i = 0; i < getLength(); i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}

package shape;

public class Parallelogram extends AbstractSquare {

	public Parallelogram(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		for (int i = getHeight(); i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= getWidth(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return String.format("Parallelogram (width: %d, height: %d)", getWidth(), getHeight());
	}
}

package shape;

public class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	@Override
	public String toString() {
		return String.format("Rectangle (width: %d, height: %d)", width, height);
	}

	// getter
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	// setter
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

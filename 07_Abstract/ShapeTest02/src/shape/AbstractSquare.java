package shape;

// 자식 클래스 - Shape 클래스의 자식 클래스
// 부모 클래스 - Rectangle, Parallelogram의 부모 클래스
// 추상 클래스 - Shape의 추상 메서드인 draw()와 toString() 오버라이딩 하지 않음.
// - Plane2D 인터페이스의 추상 메서드인 getArea() 오버라이딩 하지 않음.
/*
상속과 구현은 같이 할 수 있음
상속을 먼저하고 구현을 해야 함. 안그러면 에러 발생
-> 왜? 다중 상속은 안되는데 다중 구현은 가능하기 때문
다중 구현이 가능한 이유는 추상메서드이기 때문에 이름이 같아도 걍 알빠노 암거나 가져옴
구현은 부모의 범주지만 부모는 아님
*/
public abstract class AbstractSquare extends Shape implements Plane2D {
	private int width;
	private int height;

	public AbstractSquare(int width, int height) {
		this.width = width;
		this.height = height;
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

	@Override
	public void getArea() {
		System.out.printf("총 면적은 %d입니다.\n", getWidth() * getHeight());
	}

}

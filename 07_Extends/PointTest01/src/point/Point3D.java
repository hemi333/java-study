package point;

// 클래스 Point3D는 클래스 Point2D의 모든 자산을 상속 받는다. (확장한다.)
// 물려 받는 자산: 멤버 변수, 멤버 메소드를 포함, 초기자와 생성자는 포함하지 않음.
public class Point3D extends Point2D {
	private int z;

	// 생성자
	// super(): 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하는 것
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	// getter
	public int getZ() {
		return z;
	}

	// setter
	public void setZ(int z) {
		this.z = z;
	}

	// 오버라이딩
	@Override
	public String toString() {
		return String.format("(%d, %d, %d)", getX(), getY(), getZ());
//		return super.toString() + ", z=" + getZ();
	}
}

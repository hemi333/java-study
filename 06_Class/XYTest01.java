class XY {
	// 클래스 변수, static field
	private static int count = 0;

	// 인스턴스 변수, non-static field
	private int x = 0;
	private int y = 0;
	private int id = 0;

	// 인스턴스 초기자(instance initailizer), 인스턴스 블럭(instance block)
	// - 생성자에 들어가기 직전에 실행하는 것
	// - 용도: 모든 생성자에서 공통적으로 해야할 일을 명시적으로 적어둘 때 사용
	{
		id = ++count;
	}

	// 생성자
	public XY() {
	}

	public XY(int x) {
		this.x = x;
	}

	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 복사 생성자
	public XY(XY n) {
		this.x = n.x;
		this.y = n.y;

	}

	// 출력 메서드
	public String toString() {
		return String.format("No:%d, %d, %d", id, x, y);
	}
}

// 문제) XY 클래스의 인스턴스 4개를 종류별로 만들어 출력하시오.
// 일련번호의 id는 자동으로 1씩 증가하도록 설계하시오.
public class XYTest01 {
	public static void main(String[] args) {
		XY xy1 = new XY();
		XY xy2 = new XY(50);
		XY xy3 = new XY(30, 40);
		XY xy4 = new XY(xy3);

		System.out.println(xy1.toString());
		System.out.println(xy2.toString());
		System.out.println(xy3.toString());
		System.out.println(xy4.toString());

	}
}

package calc;

public class CalcEx {
	private Calc c;

	public void compute() {
		System.out.println(c.add(10, 20));
		System.out.println(c.subtract(50, 20));
		System.out.println(c.multiply(10, 20));
		// System.out.println(c.divide(50, 10)); // 같은 패키지 안이라도 private 멤버는 사용 불가
	}
}

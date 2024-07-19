/*
 * 클래스 메서드에서는 클래스 변수, 클래스 메서드는 사용 가능
 * 인스턴스 메서드에서는 인스턴스 변수, 클래스 변수, 인스턴스 메서드, 클래스 메서드 모두 사용가능
 */

class Static {
	private static int s; // class 변수
	private int i; // instance 변수

	public static void sm1() { // class 메서드
	}

	public void im1() { // instance 메서드
	}

	public static void sm2(int x) { // class 메서드
		s = x;
//		i = x; // 클래스 메서드에서는 인스턴스 변수에 접근 불가
		sm1();
//		im1(); // 클래스 메서드에서는 인스턴스 메서드에 접근 불가
	}

	public void im2(int x) { // instance 메서드
		s = x;
		i = x;
		sm1();
		im1();
	}

	// getter
	public static int getS() {
		return s;
	}

	public int getI() {
		return i;
	}
	// setter
}

public class StaticTest01 {
	public static void main(String[] args) {
		Static s1 = new Static(); // i, im1, im2를 갖고 생성됨
		Static s2 = new Static();
		Static s3 = new Static();

		s1.im2(10);
		Static.sm2(30);

		System.out.println("s1의 i: " + s1.getI());
		System.out.println("s2의 i: " + s2.getI());
		System.out.println("s3의 i: " + s3.getI());

		System.out.println("Static의 s: " + Static.getS());

	}
}

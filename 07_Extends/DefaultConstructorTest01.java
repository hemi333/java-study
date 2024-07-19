// 부모 클래스
class A {
	private int a;

	public A() {
		a = 50;
	}

	public int getA() {
		return a;
	}
}

// 자식 클래스
class B extends A {

	// 기본 디폴트 값(안써도 적용됨)
	// public B() {
	// super();
	// }

}

// 다른 클래스로부터 상속받지 않은 모든 클래스는 -> Object 클래스의 자식
// Object란? java.lang.Object 클래스 / 현재 관계는 Object > A > B 이런 관계

public class DefaultConstructorTest01 {
	public static void main(String[] args) {
		B x = new B();

		System.out.println(x.getA());

	}
}

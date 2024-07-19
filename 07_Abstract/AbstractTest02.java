abstract class A {
	public abstract void a();

	public abstract void b();
}

// 문제점 : class A로부터 상속을 받았을 때 에러 발생
// 해결책 : class B를 추상 클래스로 선언하여 해결 (인스턴스를 생성할 수 없다.)
// abstract class B extends A {
// }

// 해결책 : class B에서 class A의 추상 메서드를 오버라이딩 함
// class B extends A {
// public void a() {};
// public void b() {};
// }

// 해결책3: class B에서 추상 메서드 1개만 오버라이딩 함, 그러면 나머지 1개의 추상 메서드를 갖게 됨, class B는 추상 클래스로 선언해야 함.
abstract class B extends A {
	public void a() {
	}
}

// 문제점 : class B는 class A의 추상 메서드 B를 오버라이딩 하지 않아서 추상 메서드를 내포하고 있음
// 해결책 : 상속 받은 추상 메서드 B를 class C에서 오버라이딩 해야 함.
class C extends B {
	public void b() {
	}
}

public class AbstractTest02 {
	public static void main(String[] args) {

	}
}

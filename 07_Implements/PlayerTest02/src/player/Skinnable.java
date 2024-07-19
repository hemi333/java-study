package player;

/*
< 인터페이스의 규칙 >
1. 인터페이스 안의 모든 메서드는 public으로 선언된 추상 메서드뿐이다.
-> 모든 메서드는 public abstract가 붙어있다.
-> 인터페이스 안의 추상 메서드는 public과 abstract를 생략할 수 있다.

2. 인터페이스 안의 변수는 public으로 선언된 클래스 상수뿐이다. (대문자는 상수에만 쓴다)
-> 모든 상수는 public static final이 붙어 있다.
-> public, static, final을 생략할 수 있다.

*/

public interface Skinnable {

	/* public static final */ int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	int BLACK = 4;
	int LEOPARD = 5;

	/* public abstract */ void changeSkin(int skin);
}

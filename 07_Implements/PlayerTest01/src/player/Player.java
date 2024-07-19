package player;

/*
< 인터페이스의 구현 >
1. 인터페이스의 메서드는 오직 추상 메서드만 존재한다.
2. 인터페이스의 추상 메서드에서는 public abstract를 생략할 수 있다.
3. 인터페이스는 인스턴스를 생성할 수 있다.
4. 인터페이스의 배열을 생성하여 다형성을 구현할 수 있다.
*/
public interface Player {

	void play();

	void stop();

}

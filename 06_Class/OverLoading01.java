/*
< 메서드 오버로딩(Method Overloading) >
- 메서드 중복 정의
- 메서드의 이름은 같지만, 매개변수의 개수 또는 타입을 다르게 정의하는 것
- 주의) 매개변수의 이름과 리턴타입은 오버로딩에 포함되지 않음

- 오버로딩을 왜 써야함? 이름을 다르게 하면 되잖아 -> 협업을 위해서!(매뉴얼을 찾아보는 시간 발생)
- 찾아볼 필요 없이 만들어져 있으면 그냥 호출하면 되니까
*/
public class OverLoading01 {
	// 이름이 같은 메서드를 또 만들 수 있나? -> 있다!
	// 조건은 매개변수의 개수와 타입이 다르다면 가능!
	static double add(double a, double b) {
		return a + b;
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a) {
		return ++a;
	}

	// 에러 - 중복 정의
	/*
	 * static double add(int x, int y) { return (double) x + y; }
	 */

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(1.0, 5.0));
		System.out.println(add(10, 30));
	}
}

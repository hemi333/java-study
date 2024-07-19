
public class Method01 {

	// 메서드 정의
	static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int a = 10, b = 20;

		int c = add(a, b); // 메소드 호출

		System.out.println("c = " + c);
	}
}

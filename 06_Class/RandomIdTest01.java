import java.util.Random;

// 100, 200, 300, 400, 500, 600, 700, 800, 900 중에서 한 개의 임의의 값을 생성하여 클래스 변수에 초기화
// 모든 인스턴스의 id 값은 클래스 변수에서 생성한 값을 기준으로 1씩 증가
// ex) 501, 502, 503 ...
class RandomId {
	private static int count; // 클래스 변수
	private int id; // 인스턴스 변수

	// 클래스 초기자(class initializer), 클래스 블럭(class block)
	// static 초기자(정적 초기자), static 블럭(정적 블럭)
	// 용도: 클래스의 활용 직전에 딱 1번만 호출, 클래스 전체의 인스턴스에서 딱 1번만 초기화를 해야 하는 경우에 사용.
	static {
		// 난수 생성 전용 클래스: Math 클래스를 활용
		// nextInt(seed): 0~seed값 미만의 정수 난수를 생성
		// 0~8 -> 0~800 -> 100~900

		// 1. 명시적인 인스턴스 사용 방법
		// Random r = new Random();
		// count = (r.nextInt(9) * 100) + 100; //● -> 0~8까지의 난수

		// 2. 익명 인스턴스 사용 방법 -> 한번만 사용할 경우, ● 굳이 r이라는 변수를 안만들겠다.
		count = (new Random().nextInt(9) * 100) + 100;

		// 3. Math 클래스 활용
//		int r = ((int) Math.random() * 9) * 100 + 100;
//		count = (int) (Math.random() * 9 + 1) * 100;
	}

	// 기본 생성자
	public RandomId() {
		id = ++count;
	}

	// getter
	public static int getCount() { // 클래스 메서드
		return count;
	}

	public int getId() { // 인스턴스 메서드
		return id;
	}

}

public class RandomIdTest01 {
	public static void main(String[] args) {
		RandomId a = new RandomId();
		RandomId b = new RandomId();
		RandomId c = new RandomId();

		System.out.println("a's Id = " + a.getId());
		System.out.println("b's Id = " + b.getId());
		System.out.println("c's Id = " + c.getId());
	}
}

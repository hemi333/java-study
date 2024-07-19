import java.util.Random;

public class RandomTest01 {
	public static void main(String[] args) {
		// Random 클래스: 난수를 생성하는 다양한 메서드를 가지는 함수
		// 내부적으로 Math 클래스를 활용하는 클래스
		// nextInt(n): 0- ~n-1, 사이의 난수 생성하는 메서드

		Random random = new Random();

		// 0 ~ 9 사이의 정수 난수
		int n = random.nextInt(10);
		System.out.println(n);

		// 1 ~ 9 사이의 정수 난수
		n = random.nextInt(9) + 1;
		System.out.println(n);

		// 1 ~ 10 사이의 정수 난수
		n = random.nextInt(10) + 1;
		System.out.println(n);

		// 주사위: 1 ~ 6 사이의 난수
		n = random.nextInt(6) + 1;
		System.out.println(n);

		// 로또: 1 ~ 45 사이의 난수
		n = random.nextInt(45) + 1;
		System.out.println(n);
	}
}

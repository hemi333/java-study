
public class MathTest03 {
	public static void main(String[] args) {
		// 난수의 활용
		// 난수: random number, 임의의 수, 무작위수

		// random(): 0 ~ 1 미만의 수를 난수를 생성함.
		double rn = Math.random();
		System.out.println(rn);

		// 0 ~ 9 사이의 정수 난수
		int n = (int) (Math.random() * 10);
		System.out.println(n);

		// 1 ~ 9 사이의 정수 난수
		n = (int) (Math.random() * 9) + 1;
		System.out.println(n);

		// 1 ~ 10 사이의 정수 난수
		n = (int) (Math.random() * 10) + 1;
		System.out.println(n);

		// 주사위: 1 ~ 6 사이의 난수
		n = (int) (Math.random() * 6) + 1;
		System.out.println(n);

		// 로또: 1 ~ 45 사이의 난수
		n = (int) (Math.random() * 45) + 1;
		System.out.println(n);
	}
}

import java.util.Scanner;

// 문제) 0 ~ 2 사이의 난수를 발생하여, 가위 바위 보 게임을 작성하시오.
// 0: 가위, 1: 바위, 2: 보
public class If06 {
	public static void main(String[] args) {
		// 난수 생성 0 ~ 0.99999...
		// 0 ~ 10 사이의 난수 (*10)+ 1 -> 0 ~ 9.999... -> 1 ~ 10
		// int rm = (int) (Math.random() * 10) + 1; // int로 casting
		// System.out.println(rm);
		// 선언
		Scanner sc = new Scanner(System.in);

		System.out.println("0: 가위, 1: 바위, 2: 보 중에서 입력하세요: ");
		int n = sc.nextInt();
		int rn = (int) (Math.random() * 3);
		int result = ((n - rn) + 3) % 3; // 3가지니까 3을 더함

		// switch case문으로 간결하게 할 수 있음
		if (result == 1) {
			System.out.println(rn);
			System.out.println("이겼습니다!");
		} else if (result == 2) {
			System.out.println(rn);
			System.out.println("졌습니다!");
		} else {
			System.out.println(rn);
			System.out.println("비겼습니다!");
		}

	}
}

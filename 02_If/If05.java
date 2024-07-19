import java.util.Scanner;

// 문제) 정수 1개를 입력하여, 1자리 수인지, 2자리 수인지, 3자리 수인지, 그 이상인지를 판별하시오.
// -7은 1자리 수입니다.
// 15는 2자리 수입니다.
// 357은 3자리 수입니다.
// 4500은 4자리 수 이상입니다.
public class If05 {
	public static void main(String[] args) {
		// 선언
		Scanner sc = new Scanner(System.in);
		int n;

		// 입력
		System.out.println("정수 입력: ");
		n = sc.nextInt();

		// 계산
		// 1번 방법
		if (n < 10 && n > -10) {
			System.out.println(n + "은 1자리 수입니다.");
		} else if (n < 100 && n > -100) {
			System.out.println(n + "은 2자리 수입니다.");
		} else if (n < 1000 && n > -1000) {
			System.out.println(n + "은 3자리 수입니다.");
		} else {
			System.out.println(n + "은 4자리 수 그 이상입니다.");
		}

		// 2번 방법 - 나누어서 몫으로 계산
		if (n / 1000 != 0) {
			System.out.println(n + "은 4자리 수 그 이상입니다.");
		} else if (n / 100 != 0) {
			System.out.println(n + "은 3자리 수입니다.");
		} else if (n / 10 != 0) {
			System.out.println(n + "은 2자리 수입니다.");
		} else {
			System.out.println(n + "은 1자리 수입니다.");
		}

		// 끝
		sc.close();

	}
}

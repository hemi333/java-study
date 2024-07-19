import java.util.Scanner;

// 문제1) 정수를 입력하여 짝수인지 홀수인지를 판별하시오.
// 문제2) 정수를 입력하여 3의 배수인지, 4의 배수인지, 3의 배수이면서 4의 배수인지, 3의 배수도 4의 배수도 아닌지를 판별하시오.
public class If02 {
	public static void main(String[] args) {
		// 선언
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력해 주세요. :");
		int n = sc.nextInt();

		// 계산
		/*
		 * if (n % 2 == 0) { System.out.println("짝수 입니다."); } else {
		 * System.out.println("홀수 입니다."); }
		 */

		if (n % 3 == 0) {
			if (n % 4 == 0) {
				System.out.println("3의 배수이면서 4의 배수입니다.");
			} else {
				System.out.println("3의 배수입니다.");
			}
		} else if (n % 4 == 0) {
			System.out.println("4의 배수입니다.");
		} else {
			System.out.println("3의 배수도 4의 배수도 아닙니다.");
		}

		// 끝
		sc.close();
	}
}

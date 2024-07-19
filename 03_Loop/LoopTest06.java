import java.util.Scanner;

// 문제) 밑변의 길이를 입력하여, 직각 이등변 삼각형을 출력하시오.
public class LoopTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("밑변 길이 입력: ");
		int n = sc.nextInt();

//		for (int i = n; i >= 1; i--) {
//			for (int j = i; j >= 1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//			for (int j = n; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//			// 여기서 543.. 으로 찍도록 바꾸기
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}
}

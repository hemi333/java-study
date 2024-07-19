import java.util.Scanner;

// 문제) 밑변을 입력하여, 정삼각형을 출력하시오.
// 밑변 길이 입력: 7
// < 출력화면 설계 >
//    *
//   ***
//  *****
// *******
public class LoopTest15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 길이 입력: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i >= (n / 2) + 1) {
				for (int j = 1; j <= i; j++) {
//					if () {
//						System.out.print(" ");
//					} else {
					System.out.print("*" + j);
//					}

				}
				System.out.println();
			}

		}
		sc.close();
	}
}
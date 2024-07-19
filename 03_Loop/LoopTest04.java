import java.util.Scanner;

// 문제) 너비와 높이를 정수로 입력하여, 직사각형을 출력하시오.
public class LoopTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("너비 입력: ");
		int w = sc.nextInt();
		System.out.print("높이 입력: ");
		int h = sc.nextInt();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

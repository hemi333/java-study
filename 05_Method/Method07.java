import java.util.Scanner;

// 문제) 최하변이 직각인 직각 이등변 삼각형을 메서드를 사용하여 출력하시오.
// 별표를 출력하는 부분을 메소드로 작성
// 메소드명: putStar
public class Method07 {
	static void putStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("밑변의 길이: ");
		int n = sc.nextInt();

		putStar(n);

		sc.close();
	}
}

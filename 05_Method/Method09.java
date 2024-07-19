import java.util.Scanner;

// 문제) 최하변이 직각인 직각 이등변 삼각형을 메서드를 사용하여 출력하시오.
// 기호를 입력하고 입력한 기호의 최하변이 직각인 이등변 삼각형을 출력
// 메소드명: putStar
public class Method09 {
	static void putStar(char c, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("기호 입력: ");
		char c = sc.next().charAt(0);
		System.out.print("밑변 길이 입력: ");
		int n = sc.nextInt();

		putStar(c, n);

		sc.close();
	}

}

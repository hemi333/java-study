import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		// 콘솔로부터 갑을 입력하는 클래스

		Scanner sc = new Scanner(System.in); // Resource leak: 'sc' is never closed 리소스가 새고 있다 닫지 않았기 때문

		System.out.println("정수입력: ");
		int a = sc.nextInt();

		System.out.println("a = " + a);

		sc.close(); // 닫아줘야 Resource leak가 생기지 않음
	}
}

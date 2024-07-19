// import java.util.Scanner;

public class ImportTest01 {
	public static void main(String[] args) {
		// 1. 완전 수식명(Full Qualified Name, FQN)
		// - 패키지명, 클래스명으로 사용하는 방법
		java.util.Scanner sc = new java.util.Scanner(System.in); // import 없이 사용하는 방법

		// 2. 단순명(Simple Name, SN)
		// - 클래스명으로 사용하는 방법, 패키지에 대한 클래스를 import 해야 함
		// - 일반적인 클래스의 사용법
		// Scanner sc = new Scanner(System.in);

		sc.close();
	}
}

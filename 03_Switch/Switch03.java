import java.util.Scanner;

public class Switch03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("### 가위/바위/보 게임을 시작합니다. ###");
		System.out.print("0(가위), 2(바위), 3(보)");
		int user = sc.nextInt();

		// 컴퓨터 난수 (0~2)
		int comp = (int) Math.random() * 3;
		int result = ((user - comp) + 3) % 3; // 3가지니까 3을 더함(음수 해결 방법)
		String result2 = "";

		switch (result) {
		case 1:
			result2 = "win";
			break;
		case 2:
			result2 = "lose";
			break;
		default:
			result2 = "same";
			break;
		}

		System.out.println("컴퓨터가 낸 것: " + comp);
		System.out.println("User " + result2);

		sc.close();
	}
}

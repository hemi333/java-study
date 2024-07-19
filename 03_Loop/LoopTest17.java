import java.util.Scanner;

public class LoopTest17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = { "가위", "바위", "보" };
		int user, tot = 0, win = 0, lose = 0, same = 0;
		char yn;
		System.out.println("### 가위/바위/보 게임을 시작합니다. ###");

		do {
			do {
				System.out.print("[0/가위, 2/바위, 3/보] 0~2 사이의 정수 입력: ");
				user = sc.nextInt();
			} while (!(user >= 0 && user <= 2));

			// 컴퓨터 난수 (0~2)
			int comp = (int) Math.random() * 3;
			int result = ((user - comp) + 3) % 3; // 3가지니까 3을 더함(음수 해결 방법)
			String result2 = "";

			++tot;
			switch (result) {
			case 1:
				result2 = "win";
				++win;
				break;
			case 2:
				result2 = "lose";
				++lose;
				break;
			default:
				result2 = "same";
				++same;
				break;
			}

			System.out.printf("*컴퓨터: %s, *게이머: %s -> 게이머 %s\n", names[comp], names[user], result2);
			System.out.printf("%d전 %d승 %d패 %d무승부", tot, win, lose, same);

			System.out.print("한번 더 게임을 하시겠습니까?(y/n): ");
			yn = sc.next().toLowerCase().charAt(0);

		} while (yn == 'y');

		sc.close();
	}
}

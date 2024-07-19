import java.util.Scanner;

// 문제) 1~100 사이의 난수를 생성하고, 사용자는 이 난수를 맞추시오.
// 이 때 몇 번 맞추었는지를 구하고, 맞춘 난수를 출력하시오.
public class LoopTest12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int user, cnt = 0;
		int comp = (int) (Math.random() * 100) + 1;

		do {
			System.out.print("난수를 맞춰보세요!: ");
			user = sc.nextInt();
			++cnt;

			if (user > comp) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			if (user < comp) {
				System.out.println("더 큰 수를 입력하세요.");
			}
		} while (user != comp);

		System.out.printf("맞추셨어요! 정답은 %d입니다. %d번 만에 맞추었어요!", comp, cnt);
		sc.close();
	}
}

package test;

import account.Account;
import account.TimeAccount;

/*
문제) 아래의 작업 지시 사항에 따라 다형성을 구하시오.
1. Account, TimeAccount 클래스의 인스턴스를 각 2개씩 담을 수 있는 배열을 생성하여 다항성을 구현하시오.
2. 반복문을 사용하여 배열에 있는 인스턴스의 정보를 출력하시오.
 */
public class AccountTest06 {
	public static void main(String[] args) {
		// 다형성 1번
		Account[] accounts = new Account[4];
		accounts[0] = new Account("지수", "123456", 500);
		accounts[1] = new Account("로제", "456789", 1000);
		accounts[2] = new TimeAccount("제니", "789123", 2000, 500);
		accounts[3] = new TimeAccount("혜미", "987654", 3000, 1000);

		// 다형성 2번
		// Account[] accounts = new Account[] {
		// new Account("지수", "123", 500),
		// new Account("로제", "456", 1000),
		// new TimeAccount("제니", "789", 2000, 500),
		// new TimeAccount("혜미", "987", 3000, 1000)
		// };

		// for문 1번
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
		System.out.println();

		// for문 2번 (확장 for문)
		for (Account a : accounts) {
			System.out.println(a);
		}
	}
}

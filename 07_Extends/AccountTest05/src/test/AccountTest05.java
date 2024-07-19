package test;

import account.Account;
import account.TimeAccount;

public class AccountTest05 {
	public static void main(String[] args) {
		Account a1 = new Account("송태섭", "777777", 5000);
		TimeAccount a2 = new TimeAccount("정우성", "999999", 3000, 500);

		Account x;
		// 얕은 복사
		x = a1; // 같은 타입 : 가능
		x = a2; // 부모의 참조변수는 자식의 인스턴스를 참조할 수 있다. : 가능 -> 다형성 구현의 출발점

		TimeAccount y;
		// y = a1; // 자식의 참조변수는 부모의 인스턴스를 참조할 수 없다. : 불가
		y = a2; // 같은 타입 : 가능

		// 1번
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println();

		// 2번
		// a1.printAccount();
		// System.out.println();
		// a2.printAccount();
	}
}

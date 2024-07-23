package account;

import java.text.DecimalFormat;

import exception.BalanceInsufficientException;
import exception.MinusDepositException;

// 은행 계좌 클래스
// 인스턴스 변수: 계좌명의(name), 계좌번호(no), 예금잔고(balance)
public class Account {
	private String name;
	private String no;
	private long balance;
	private DecimalFormat df = new DecimalFormat("#,###");

	public Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	// getter, setter 생략

	// 입금 -> 예외 처리 메서드
	// 음수값이 전달되는 경우
	public void deposit(long money) throws MinusDepositException {
		// 1. 절차지향 프로그래밍 방법
		// * 단점
		// - 아래의 코드 일반 코드인지 예외를 처리하기 위한 코드인지 구분이 어려움.
		// - 메서드가 예외를 처리하고 있는지 파악이 어려움.
//		if (money < 0) {
//			System.out.println("마이너스 금액은 입금할 수 없습니다.");
//			return;
//		}

		// 2. 예외 처리 클래스 활용하는 방법
		if (money < 0) {
			throw new MinusDepositException("마이너스 입금 오류: " + df.format(money) + "원은 입력할 수 없습니다.");
		}
		balance += money;
		// 후처리
		System.out.println(name + "님 계좌에 " + df.format(money) + "원이 입금 되었습니다.");
	}

	// 출금 -> 예외 처리 메서드
	// 예금 잔고보다 큰 금액을 출금하는 경우 처리
	public void withdraw(long money) throws BalanceInsufficientException {
		// 1. 절차지향 프로그래밍 방법
//		if (balance < money) {
//			System.out.println("잔고가 부족합니다.");
//			return;
//		}
		if (balance < money) {
			throw new BalanceInsufficientException("잔고 부족: " + df.format(money - balance) + "원이 부족합니다.");
		}
		balance -= money;
		// 후처리
		System.out.println(name + "님 계좌에서 " + df.format(money) + "원이 출금 되었습니다.");
	}

	@Override
	public String toString() {
		return String.format("[%s] %s : %s", name, no, df.format(balance));
	}
}

import java.util.Scanner;

/*
은행 계좌 클래스 구현
- 속성: 계좌명의, 계좌번호, 예금잔고

// AccountTest01에서의 문제점
(해결)문제점1: 계산의 정보를 변수형, 주석을 통해 알 수 있다.
(해결)문제점2: 한 사람의 계좌라면 하나로 묶어서 처리해야 하지만, 그렇지 않다.
(미해결)문제점3: 아무나 변수를 통해 입금과 출금이 가능하도록 되어 있다.

// 새로운 문제점 발현
문제점1: 확실한 초기화에 대한 보장이 되지 않았다.
*/

// 인터페이스
class Account {
	// 멤버 변수
	String name;
	String no;
	int balance;

	// default 생성자 - 쓰지 않아도 생성됨
	public Account() {
	}
}

public class AccountTest02 {
	public static void main(String[] args) {
		// 똑같이 생겼다! (java.util에서 만든 class)
		Scanner sc = new Scanner(System.in);
		// 똑같이 생겼다! (내가 만든 class)
		Account john = new Account(); // new Account()로 실체를 만듦 (인스턴스)
		Account mary = new Account();
		// 인스턴스(instance) - 클래스를 통해서 만들어진 객체

		// John 계좌 정보
		john.name = "John";
		john.no = "123456";
		john.balance = 1000;

		// Mary 계좌 정보
		mary.name = "Mary";
		mary.no = "654321";
		mary.balance = 500;

		// 기능 - 입금, 출금
		john.balance -= 200; // 출금
		mary.balance += 100; // 입금

		// John 계좌 출력
		System.out.println("※ John의 계좌");
		System.out.println("계좌명의: " + john.name);
		System.out.println("계좌번호: " + john.no);
		System.out.println("예금잔고: " + john.balance);
		System.out.println();

		System.out.println("※ Mary의 계좌");
		System.out.println("계좌명의: " + mary.name);
		System.out.println("계좌번호: " + mary.no);
		System.out.println("예금잔고: " + mary.balance);
		System.out.println();
	}
}

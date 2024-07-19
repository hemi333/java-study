/*
은행 계좌 클래스
- 속성(멤버변수): 계좌명의, 계좌번호, 예금잔고

// AccountTest02에서의 문제점
(생성자를 통해 해결)문제점1: 확실한 초기화에 대한 보장이 되지 않았다.
()문제점2: 아무나 변수를 통해 입금과 출금이 가능하도록 되어 있다.

< 멤버 접근 페이지(한정자), access modifier >
- private : 같은 클래스의 멤버만 사용이 가능
- default : 같은 패키지 내에서만 사용이 가능, 접근 제어자를 쓰지 않은 상태
- protacted : 상속을 받은 자식 클래스에서 사용이 가능
- public : 어디에서나 사용이 가능

< 클래스 >
- 속성 -> 멤버 변수: name, no, balance
- 기능 -> 멤버 메서드: getter/setter, deposit, withdraw
- 생성자 -> 

*/

class Account {
	// private: 접근 제한자
	private String name;
	private String no;
	private int balance;

	// default 생성자 - 매개변수가 없는 생성자
	// 1. class를 만들면 무조건 생성
	// 2. 다른 생성자를 만들면 디폴트 생성자는 사라짐
	public Account() {
	}

	// ★★★★★ 중요!
	// 생성자 오버로딩
	// 생성자 (constructor)
	// 생성자의 특징: class명과 동일, 리턴타입이 없음
	// 생성자의 목적: 멤버변수의 확실한 초기화의 보장
	// 생성자의 호출 시기: 인스턴스를 생성할 때만 호출
	// ★매개변수와 멤버변수가 같으면 매개변수에 매개변수를 넣어주기 때문에 금지! (this 붙여야 함)
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	// accessor - getter/setter 메서드를 한꺼번에 부를 때
	// setter 메서드 - set 멤버변수명을 가진 메서드들, 값을 설정하는 역할
	public void setName(String name) {
		this.name = name;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// getter 메서드 - get 멤버 변수명을 가진 메서드들, 값을 획득(return)하는 역할
	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public int getBalance() {
		return balance;
	}

	// 입금 메서드
	public void deposit(int money) {
		this.balance += money;
	}

	// 출금 메서드
	public void withdraw(int money) {
		this.balance -= money;
	}

}

public class AccountTest03 {
	public static void main(String[] args) {
		// 인스턴스를 만들 때에만 생성자 호출
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);

		Account tomy = new Account();

		// 기능 - 입금, 출금
		// 멤버 변수는 접근 불가능
		// john.balance -= 200; // 출금
		// mary.balance += 100; // 입금

		// 멤버 메서드를 통해서 접근 가능
		john.withdraw(200);
		mary.deposit(100);

		System.out.println("※John의 계좌");
		System.out.println("계좌명의: " + john.getName());
		System.out.println("계좌번호: " + john.getNo());
		System.out.println("예금잔고: " + john.getBalance());
		System.out.println();

		System.out.println("※Mary의 계좌");
		System.out.println("계좌명의: " + mary.getName());
		System.out.println("계좌번호: " + mary.getNo());
		System.out.println("예금잔고: " + mary.getBalance());
		System.out.println();
	}
}

package account;

// 부모 클래스
// - 계좌명의, 계좌번호, 예금잔고
public class Account {
	// 인스턴스 변수
	private String name;
	private String no;
	private int balance;

	// 생성자
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public int getBalance() {
		return balance;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 입금 메서드
	public void deposit(int money) {
		balance += money;
	}

	// 출금 메서드
	public void withdraw(int money) {
		balance -= money;
	}

	// 출력 메서드 1번 - toString()
	public String toString() {
		return String.format("계좌 명의: %s, 계좌 번호: %s, 계좌 잔고: %d", name, no, balance);
	}

	// 출력 메서드 2번 - printAccount()
	public void printAccount() {
		System.out.println("계좌 명의: " + name);
		System.out.println("계좌 번호: " + no);
		System.out.println("계좌 잔고: " + balance);
	}
}

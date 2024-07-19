class Account {
	// 멤버 변수

	// class 변수, static field(정적 필드)
	// - 클래스에서 딱 1개만 만들어지고, 모든 인스턴스에서 공유하는 변수
	private static int count = 0;

	// instance 변수, non-static field(비정적 필드)
	// - 인스턴스를 생성할 때 모든 인스턴스마다 만들어지는 변수
	private String name;
	private String no;
	private int balance;
	private int id = 1;

	// default 생성자
	public Account() {
	}

	// 매개변수를 갖는 생성자 - 생성자 오버로딩
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.id = ++count;
	}

	// 클래스 메서드, static 메서드(정적 메서드)
	public static int getCount() {
		return count;
	}

	// 인스턴스 메서드, non-static 메서드(비정적 메서드)
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

	public int getId() {
		return id;
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

// 문제) 각 계좌별로 1부터 1씩 자동으로 증가하는 식별번호를 부여하시오.
// 식별번호는 AccountClass의 멤버로 구성하시오.
public class AccountTest04 {
	public static void main(String[] args) {
		// 인스턴스를 만들 때에만 생성자 호출
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account tomy = new Account("Tomy", "195483", 3000);

		System.out.println("※ John의 계좌");
		System.out.println("식별번호: " + john.getId());
		System.out.println("계좌명의: " + john.getName());
		System.out.println("계좌번호: " + john.getNo());
		System.out.println("계좌잔액: " + john.getBalance());
		System.out.println();

		System.out.println("※ Mary의 계좌");
		System.out.println("식별번호: " + mary.getId());
		System.out.println("계좌명의: " + mary.getName());
		System.out.println("계좌번호: " + mary.getNo());
		System.out.println("계좌잔액: " + mary.getBalance());
		System.out.println();

		System.out.println("※ Tomy의 계좌");
		System.out.println("식별번호: " + tomy.getId());
		System.out.println("계좌명의: " + tomy.getName());
		System.out.println("계좌번호: " + tomy.getNo());
		System.out.println("계좌잔액: " + tomy.getBalance());
		System.out.println();

		// static 멤버를 사용하는 방법
		// 클래스명.메서드명
		System.out.println("지금까지 발급된 계좌의 개수: " + Account.getCount());

	}
}

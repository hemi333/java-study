package account;

// 자식 클래스 <- 정기 예금 계좌 클래스
// - 정기예금금액 추가
public class TimeAccount extends Account {

	// 처음 extends하고 에러 발생되는 이유 - 생성자 오버로딩 때문
	// 부모 클래스에서 매개변수가 있는 생성자가 있는데 왜 넌 아무것도 없어?!
	// * 해결 방안 *
	// 1. 부모 class에 default 생성자 만들기
	// 2. 자식 class에 부모를 상속받은 생성자 만들기

	// 인스턴스 변수
	private int timeBalance;

	// 생성자
	// super(): 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하는 방법,
	// 부모 클래스의 private 멤버의 초기화를 부모 클래스의 생성자에게 위임하는 방법
	public TimeAccount(String name, String no, int balance, int timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	// getter
	public int getTimeBalance() {
		return timeBalance;
	}

	// setter
	public void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}

	// 정기 예금 해약 메서드
	public void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}

	// 출력 메서드 1번
	@Override
	public String toString() {
		return super.toString() + ", 정기예금잔고: " + timeBalance;
	}

	// 출력 메서드 2번
	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("정기예금잔고: " + timeBalance);
	}

}

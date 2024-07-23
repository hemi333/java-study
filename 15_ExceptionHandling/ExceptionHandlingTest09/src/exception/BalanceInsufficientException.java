package exception;

// 출금시에 예금잔고 부족 예외 클래스
public class BalanceInsufficientException extends Exception {
	private static final long serialVersionUID = 1L;

	public BalanceInsufficientException(String msg) {
		super(msg);
	}
}

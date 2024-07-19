/*
은행 계좌 클래스 - 클래스의 개념을 적용하지 않은 예
- 속성(변수): 계좌명의, 계좌번호, 예금잔고
- 기능(메서드): 입금, 출금

문제점1: 계산의 정보를 변수형, 주석을 통해 알 수 있다.
문제점2: 한 사람의 계좌라면 하나로 묶어서 처리해야 하지만, 그렇지 않다.
문제점3: 아무나 변수를 통해 입금과 출금이 가능하도록 되어 있다.
*/
public class AccountTest01 {
	public static void main(String[] args) {
		// John의 계좌
		String johnAccountName = "John";
		String johnAccountNo = "123456";
		int johnAccountBalance = 1000;

		// Mary의 계좌
		String maryAccountName = "Mary";
		String maryAccountNo = "654321";
		int maryAccountBalance = 500;

		// 기능
		johnAccountBalance -= 200; // 출금
		maryAccountBalance += 100; // 입금

		// John의 계좌 출력
		System.out.println("※ John의 계좌");
		System.out.println("계좌 명의: " + johnAccountName);
		System.out.println("계좌 번호: " + johnAccountNo);
		System.out.println("예금 잔고: " + johnAccountBalance);
		System.out.println();

		// Mary의 계좌 출력
		System.out.println("※ Mary의 계좌");
		System.out.println("계좌 명의: " + maryAccountName);
		System.out.println("계좌 번호: " + maryAccountNo);
		System.out.println("예금 잔고: " + maryAccountBalance);
		System.out.println();
	}
}

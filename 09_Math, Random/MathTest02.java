
public class MathTest02 {
	public static void main(String[] args) {
		double n = 567.5678;
		double n2;

		// round() 메서드 활용
		// 1의 자리로 반올림
		System.out.println(Math.round(n)); // 568
		// 소수점 첫 째자리로 반올림
		n2 = Math.round(n * 10) / 10.0;
		System.out.println(n2); // 567.6
		// 소수점 둘 째자리로 반올림
		n2 = Math.round(n * 100) / 100.0;
		System.out.println(n2); // 567.57
		// 소수점 셋 째자리로 반올림
		n2 = Math.round(n * 1000) / 1000.0;
		System.out.println(n2); // 567.568
		System.out.println("-----");

		// ceil() 메서드 활용
		n = 567.1234;
		// 1의 자리로 올림
		System.out.println(Math.ceil(n)); // 568.0
		// 소수점 첫 째자리로 올림
		n2 = Math.ceil(n * 10) / 10.0;
		System.out.println(n2); // 567.2
		// 소수점 둘 째자리로 올림
		n2 = Math.ceil(n * 100) / 100.0;
		System.out.println(n2); // 567.13
		// 소수점 셋 째자리로 올림
		n2 = Math.ceil(n * 1000) / 1000.0;
		System.out.println(n2); // 567.124
		System.out.println("-----");

		// floor() 메서드 활용
		n = 567.5678;
		// 1의 자리로 내림
		System.out.println(Math.floor(n)); // 567.0
		// 소수점 첫 째자리로 내림
		n2 = Math.floor(n * 10) / 10.0;
		System.out.println(n2); // 567.5
		// 소수점 둘 째자리로 내림
		n2 = Math.floor(n * 100) / 100.0;
		System.out.println(n2); // 567.56
		// 소수점 셋 째자리로 내림
		n2 = Math.floor(n * 1000) / 1000.0;
		System.out.println(n2); // 567.567
		System.out.println("-----");
	}
}

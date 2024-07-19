
public class Operator02 {
	public static void main(String[] args) {

		// 6. 비트 연산자 : &(비트 AND), |(비트 OR), ^(Exclusive OR, XOR, 배타적 OR), ~(비트 NOT)
		// 2진수로 계산하는 연산자
		// 47 : 00101111
		// 73 : 01001001
		int a = 47, b = 73;
		System.out.println(a & b); // 9
		System.out.println(a | b); // 111
		System.out.println(a ^ b); // 102

		// binary: 2진수, octal: 8진수, hexadecimal: 16진수, decimal: 10진수
		// 10진수를 2진수, 8진수, 16진수로 출력하는 방법
		System.out.println(Integer.toBinaryString(a)); // 101111 -> 2진수
		System.out.println(Integer.toOctalString(a)); // 57 -> 8진수 출력
		System.out.println(Integer.toHexString(a)); // 2f -> 16진수 출력

		System.out.println(Integer.toBinaryString(b)); // 1001001 -> 2진수
		System.out.println(Integer.toOctalString(b)); // 111 -> 8진수
		System.out.println(Integer.toHexString(b)); // 49 -> 16진수

		// 2진수를 10진수로, 8진수를 10진수로, 16진수를 10진수로 출력하는 방법
		System.out.println(Integer.parseInt("101111", 2)); // 47
		System.out.println(Integer.parseInt("57", 8)); // 47
		System.out.println(Integer.parseInt("2F", 16)); // 47

		// 7. 쉬프트 연산자: <<left shift, 2진수의 곱셈), >>(right shift)
		a = 2;
		b = 64;
		System.out.println(a << 4); // 32
		System.out.println(b >> 3); // 8

		// 8. 대임: =
		// 9. 복합 대입, 결합, 할당: +=, -=, *=, /=, %=
		a = 10;
		a += 5;
		// a = a + 5;
		System.out.println(a);
	}

}

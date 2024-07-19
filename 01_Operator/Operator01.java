public class Operator01 {
	public static void main(String[] args) {
		// 1. 산술 연산자 : +, -, *, /(몫), %(나머지)
		// *, / , % 의 우선순위가 +, -보다 높음.
		System.out.println(3 + 5);
		System.out.println(10 - 3);
		System.out.println(3 * 5);
		System.out.println(10 / 3); // 3 -> 몫
		System.out.println(10 % 3); // 1 -> 나머지
		
		// 2. 증감 연산자 : ++(증가), --(감소)
		// 변수에 대한 연산자의 따라서 : 전위 증가 연산자, 후위 증가 연산자, 전위 감소 연산자, 후위 감소 연산자
		// 전위: 먼저 자신의 값을 1증가(감소)하고, 그 이후에 대입(참조)함
		// 후위: 먼저 대입(참조)하고 난 후에, 자신의 값을 1증가(감소)함
		int a = 10, b;
		//b = ++a; // a = 11, b = 11
		//b = a++; // a = 11, b = 10
		//b = --a; // a = 9, b = 9
		b = a--; // a = 9, b = 10
		System.out.println("a = " + a + ", b = " + b);
		
		// 3. 비교(관계) 연산자 : >, >=, <, <=, ==, !=, instanceof(객체간의 비교)
		// 비교 연산 결과는 논리값이 됨. (true or false)
		// >, >=, <, <= 의 우선순위가 ==, != 보다 높음.
		int c = 10, d = 20;
		System.out.println(c > d);
		System.out.println(c >= d);
		System.out.println(c < d);
		System.out.println(c <= d);
		System.out.println(c == d);
		System.out.println(c != d);
		System.out.println();
		
		// 4. 논리 연산자 : &&(논리 AND, 논리곱), ||(논리 OR, 논리합), !(논리 NOT, 논리 부정)
		// 논리 연산의 결과는 논리값이 됨. (true or false)
		// && 가 || 보다 우선순위가 높음.
		a = 10; b = 20; c = 30; d = 40;
		System.out.println(a<b && c<d);
		System.out.println(a<b && c>d);
		System.out.println(a>b && c<d);
		System.out.println(a<b || c<d);
		System.out.println(a<b || c>d);
		System.out.println(a>b || c>d);
		System.out.println(a>b);    // false
		System.out.println(!(a>b)); // !(false) -> true
		
		// 5. 조건선택 연산자(삼항 연산자):  조건식  ? 참 : 거짓
		// 간단한 수식에서는 if ~ else의 대용으로 사용할 것을 권장
		a = 10; b = 5; 
		c = a > b ? a : b;
		System.out.println("c = " + c);
	
	}

}

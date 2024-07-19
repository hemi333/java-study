
public class MathTest01 {
	public static void main(String[] args) {
		System.out.println(Math.PI); // 3.141592653589793, 소수점 15자리
		System.out.println(Math.abs(-11)); // 절대값
		System.out.println(Math.sqrt(9)); // 루트값
		System.out.println("-----");
		// ceil(): 소수점 이하를 무조건 올림하여 실수로 리턴함.
		System.out.println(Math.ceil(10.0)); // 10.0
		System.out.println(Math.ceil(10.1)); // 11.0
		System.out.println(Math.ceil(10.5)); // 11.0
		System.out.println(Math.ceil(10.01)); // 11.0
		System.out.println(Math.ceil(10.001)); // 11.0
		System.out.println("-----");
		// floor(): 소수점 이하를 무조건 1의 자리로 내림하여 실수로 리턴함.
		System.out.println(Math.floor(10.0)); // 10.0
		System.out.println(Math.floor(10.5)); // 10.0
		System.out.println(Math.floor(10.9)); // 10.0
		System.out.println(Math.floor(10.09)); // 10.0
		System.out.println(Math.floor(10.009)); // 10.0
		System.out.println("-----");
		// round(): 소수점 첫째자리에서 반올림하여 정수로 리턴함.
		System.out.println(Math.round(5.0)); // 5
		System.out.println(Math.round(5.4)); // 5
		System.out.println(Math.round(5.5)); // 6
		System.out.println(Math.round(5.9)); // 6
		System.out.println("-----");
		// pow(x, y): x의 y승을 실수로 구함
		System.out.println(Math.pow(2.0, 3.0)); // 8.0
		System.out.println(Math.pow(3.2, 2.5)); // 18.31786887167828
		System.out.println("-----");
		// rint(): 가져온 정수값을 실수 형태로 구함.
		// 중간값(.5)일때는 짝수의 값을 선택함.
		System.out.println(Math.rint(5.4)); // 5.0
		System.out.println(Math.rint(5.5)); // 6.0
		System.out.println(Math.rint(6.4)); // 6.0
		System.out.println(Math.rint(6.5)); // 6.0
		System.out.println("-----");
		System.out.println(Math.rint(1.5)); // 2.0
		System.out.println(Math.rint(2.5)); // 2.0
		System.out.println(Math.rint(3.5)); // 4.0
		System.out.println(Math.rint(4.5)); // 4.0
		System.out.println(Math.rint(5.5)); // 6.0
		System.out.println(Math.rint(6.5)); // 6.0
		System.out.println("-----");
		// max(): 두 개의 실수를 비교하여 큰 값을 구함.
		// - 중첩해서 사용하면 여러 개 중에서 가장 큰 값을 구함.
		System.out.println(Math.max(10.0, 20.0)); // 20.0 -> 2개를 비교
		System.out.println(Math.max(10.0, Math.max(20, 30))); // 30.0 -> 3개를 비교
		System.out.println("-----");
		// min(): 두 개의 실수를 비교하여 작은 값을 구함.
		// - 중첩해서 사용하면 여러 개 중에서 가장 작은 값을 구함.
		System.out.println(Math.min(10.0, 20.0)); // 10.0 -> 2개를 비교
		System.out.println(Math.min(10.0, Math.min(20, 30))); // 10.0 -> 3개를 비교
		System.out.println("-----");
	}
}

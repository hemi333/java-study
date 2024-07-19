import java.util.Vector;

// List 계열의 특징
// 1. 순서가 없고, 중복 데이터를 허용
// 2. 가변적인(동적인) 배열 구조
// 3. Vector, ArrayList, LinkedList, Stack, Queue

// raw type: 구체화 되지 않은 타입, 날 것의 타입 (데이터 타입)
// generic type: 구체화된 타입, 일반화된 타입
public class VectorTest01 {
	public static void main(String[] args) {
		// Raw Type Vector
		// 구체화되지 않아서 문제가 발생할 소지가 큼 -> 권장하지 않는 방법
		Vector v1 = new Vector();

		v1.add(10);
		v1.add(3.5);
		v1.add("hello");
		v1.add(true);
		v1.add('A');

		// Vector의 확인
		System.out.println(v1); // [10, 3.5, hello, true, A]

		// 반복문 - 기본 for문
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(i + " : " + v1.get(i));
		}

		// Generic Type Vector
		// 구체화된 벡터, 일반화된 벡터
		// 정수만을 저장하는 벡터
		Vector<Integer> v2 = new Vector<Integer>();
		// Vector<Integer> v2 = new Vector<>(); // new 다음에 나오는 데이터 타입은 생략 가능 <>는 있어야 함

		v2.add(new Integer(10));
		v2.add(20);
		v2.add(30);
		v2.add(40);
		v2.add(50);

		// 에러
		// v2.add(3.5);
		// v2.add("hello");
		// v2.add(true);
		// v2.add('A');

		System.out.println(v2); // [10, 20, 30, 40, 50]
		System.out.println(v2.get(0)); // 10
		System.out.println(v2.get(1)); // 20
		System.out.println(v2.get(2)); // 30
		System.out.println(v2.get(3)); // 40
		System.out.println(v2.get(4)); // 50
		// System.out.println(v2.get(5)); // java.lang.ArrayIndexOutOfBoundsException

		System.out.println("벡터의 크기: " + v2.size()); // 벡터의 크기: 5
		System.out.println("-----");

		// 반복문 1번 - 기본 for문
		int tot = 0;
		for (int i = 0; i < v2.size(); i++) {
			tot += v2.get(i); // v2.get(i).intValue(); // autoUnboxing
			System.out.println(i + " : " + v2.get(i));
		}
		System.out.println("합계: " + tot);
		System.out.println("-----");

		// 반복문 2번 - 확장 for문
		tot = 0;
		for (Integer i : v2) {
			tot += i; // i.intValue(); // autoUnboxing
			System.out.println(i);
		}
		System.out.println("합계: " + tot);
		System.out.println("-----");
		System.out.println("벡터 확인: " + v2.toString()); // toString() 생략 가능

	}
}

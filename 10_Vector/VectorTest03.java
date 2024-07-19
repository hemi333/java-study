import java.util.Vector;

// Vector 클래스는 List 인터페이스를 구현하고 있는 관계
public class VectorTest03 {
	@SuppressWarnings("unchecked") // (Vector<Integer>) v1.clone();에서 워닝 뜬거 체크 안하도록 추가
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		Vector<Integer> v3 = new Vector<>();

		// 데이터 추가 1번
		v1.add(10);v1.add(20);v1.add(30);
		v2.add(40);v2.add(50);v2.add(60);
		v3.add(30);v3.add(40);v3.add(50);

		// 데이터 추가 2번
		// Integer[] a = { 10, 20, 30 };
		// for (int i = 0; i < a.length; i++) {
		// v1.add(a[i]);
		// }

		// 데이터 추가 3번 - 이거 쓰면 addAll 못씀
		// v1 = Arrays.asList(10, 20, 30);
		// v2 = Arrays.asList(40, 50, 60);
		// v3 = Arrays.asList(30, 40, 50);

		System.out.println(v1); // [10, 20, 30]
		System.out.println(v2); // [40, 50, 60]
		System.out.println(v3); // [30, 40, 50]

		// 벡터에 다른 벡터의 내용을 추가 - 순차적
		v1.addAll(v2);
		System.out.println(v1); // [10, 20, 30, 40, 50, 60]
		System.out.println(v2); // [40, 50, 60]

		// 벡터에 다른 벡터의 내용을 추가 - 중간, 비순차적
		v3.addAll(1, v2);
		System.out.println(v3); // [30, 40, 50, 60, 40, 50]
		System.out.println(v2); // [40, 50, 60]

		// 벡터에서 데이터의 존재 여부(1개)
		System.out.println(v1.contains(50)); // true
		System.out.println(v1.contains(70)); // false

		// 벡터에서 데이터의 존재 여부(다른 벡터의 모든 데이터)
		Vector<Integer> v4 = new Vector<>();
		v4.add(80);
		v4.add(90);
		System.out.println(v1.containsAll(v2)); // true
		System.out.println(v1.containsAll(v4)); // false

		// 벡터의 복제
		Vector<Integer> v5 = (Vector<Integer>) v1.clone();
		System.out.println(v1); // [10, 20, 30, 40, 50, 60]
		System.out.println(v5); // [10, 20, 30, 40, 50, 60]

	}
}

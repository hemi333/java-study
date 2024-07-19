import java.util.Vector;

// Vector의 다양한 메서드 활용
public class VectorTest02 {
	public static void main(String[] args) {
		// 정수를 저장하는 벡터 생성
		Vector<Integer> v = new Vector<>();

		// 데이터 추가하는 방법 1
		// v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);

		// 데이터 추가하는 방법 2 - 배열 활용
		int[] a = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < a.length; i++) {
			v.add(a[i]);
		}

//		// 데이터 추가하는 방법 3 - Arrays 클래스 활용
//		v = (Vector<Integer>) Arrays.asList(10, 20, 30, 40, 50); // List<> 타입으로 리턴

		// Vector 확인
		System.out.println(v); // toString() 생략

		// 데이터 출력하는 방법 1 - 인덱스를 사용
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));

		// 데이터 출력하는 방법 2 - 반복문 활용
		System.out.println("벡터 크기: " + v.size()); // 벡터 크기: 5
		for (int i = 0; i < v.size(); i++) {
			System.out.println(i + " : " + v.get(i));
		}
		System.out.println("-----");

		// 데이터 삭제(1개) - 2번째 인덱스 값 삭제
		v.remove(2);
		System.out.println(v); // [10, 20, 40, 50]

		// 데이터 삽입(중간) - 2번 인덱스에 30을 삽입
		// add(인덱스, 값): 해당 인덱스의 값을 삽입, 비순차적으로 값을 삽입
		v.add(2, 30);
		System.out.println(v); // [10, 20, 30, 40, 50]

		// 데이터 변경 - 2번 인덱스의 값을 60으로 변경
		v.set(2, 60);
		System.out.println(v); // [10, 20, 60, 40, 50]

		// 첫 번째 값 출력
		System.out.println(v.get(0)); // 권장
		System.out.println(v.firstElement());

		// 마지막 값 출력
		System.out.println(v.get(v.size() - 1));
		System.out.println(v.lastElement());

		// 인덱스에 해당하는 값 출력 - 2번 인덱스 값 출력
		System.out.println(v.get(2));
		System.out.println(v.elementAt(2));

		// 데이터 추가(순차적)
		v.add(60);

		// 값에 해당하는 인덱스 출력 - 앞에서 부터 찾은 인덱스
		System.out.println(v.indexOf(60)); // 2

		// 값에 해당하는 인덱스 출력 - 뒤에서 부터 찾은 인덱스
		System.out.println(v.lastIndexOf(60)); // 5

		// 값에 해당하는 인덱스 출력 - 해당 값이 없을 때
		System.out.println(v.indexOf(70)); // -1, 배열의 인덱스로는 존재할 수 없는 값

		// 값에 해당하는 인덱스 출력 - 중간에서 찾은 인덱스
		System.out.println(v.indexOf(60, 3)); // 5 -> 3번째 인덱스부터 찾음

		// 중간(비순차적)에서 데이터 추가
		v.add(3, 70); // 권장
		// v.insertElementAt(70, 3); // 벡터에만 존재
		System.out.println(v); // [10, 20, 60, 70, 40, 50, 60]

		System.out.println("벡터 크기: " + v.size()); // 벡터 크기: 7
		// 벡터 사이즈 변경
		v.setSize(5);
		System.out.println("벡터 크기: " + v.size()); // 벡터 크기: 5
		System.out.println(v); // [10, 20, 60, 70, 40]

		// 벡터의 모든 데이터를 삭제
		v.clear(); // 권장
		// v.removeAll(v);
		// v.removeAllElements(v);
		System.out.println(v); // []
		System.out.println("벡터 크기: " + v.size()); // 벡터 크기: 0
	}
}

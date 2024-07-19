import java.util.ArrayList;

/*
ArrayList 클래스
1. Vector 클래스의 기능, 사용법이 거의 동일
2. Vector의 쓰레드 동기화 기능이 성능의 저하를 일으키는 요인이 됨.
-> ArrayList에서는 Vector의 쓰레드 동기화 기능을 제거하여 성능을 향상 시킴.
-> 실제로 Vector보다 ArrayList를 많이 사용함.
3. Vector의 capacity(), element가 붙은 메서드는 없음.
 */

/*
문제)
1. (o)리스트에 정수 배열에 score의 데이터를 저장하시오.
2. (o)리스트에서 60점 미만의 데이터는 삭제하시오.
3. (o)리스트의 총점과 평균을 구하시오.
4. (o)리스트의 최고점수와 최저점수를 구하시오.
5. (o)리스트를 출력하시오. (2가지 방법)
 */
public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int tot = 0, max = 0, min = 0;
		double ave = 0;

		int[] scores = { 95, 88, 75, 63, 52, 77, 47, 48, 93, 91 };

		// 리스트에 정수 배열에 score의 데이터를 저장
		for (int i = 0; i < scores.length; i++) {
			list.add(scores[i]);
		}

		// ArrayList에서 요소를 제거할 때, 인덱스를 직접 사용하면 요소를 제거할 때마다 리스트의 크기가 줄어들고, 인덱스가 변경됩니다.
		// 리스트에서 요소를 제거하면 그 뒤의 모든 요소들이 한 칸씩 앞으로 이동하게 됩니다.
		// 그러면 다음 반복에서 제거된 요소의 다음 요소를 건너뛰게 됩니다.
		// list.remove(i)가 실행되면 리스트의 크기가 줄어들고, 인덱스 i는 이미 확인된 요소를 가리키게 됩니다.
		// 따라서 list.remove(i)를 반복문 안에서 사용할 때, 인덱스를 역순으로 제거하면 이미 확인된 인덱스 이후의 요소들이 이동하지
		// 않으므로, 다음 제거할 요소의 인덱스가 변하지 않습니다.
		// 순차적으로(앞에서부터) 요소를 제거하면, 예를 들어 인덱스 0의 요소를 제거하면 그 뒤의 모든 요소들이 한 칸씩 앞으로 이동합니다.
		// 그 결과로 인덱스가 꼬이게 되어 다음 요소를 건너뛰게 됩니다.

		// 60점 미만 데이터 삭제
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) < 60) {
				list.remove(i);
			}
		}

		// 정렬 (최고점수, 최저점수 구하기 위함)
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}

			}
		}

		max = list.get(list.size() - 1);
		min = list.get(0);

		// 최고점수, 최저점수 구하기 더 쉬운 방법~~
		// max = list.get(0);
		// min = list.get(0);
		// for (int i = 1; i < list.size(); i++) {
		// if (list.get(i) > max) max = list.get(i);
		// if (list.get(i) < min) min = list.get(i);
		// }

		for (int i = 0; i < list.size() - 1; i++) {
			tot += list.get(i);
		}

		ave = (double) tot / list.size();

		System.out.printf("총점: %d, 평균: %.2f, 최고점수: %d, 최저점수: %d\n\n", tot, ave, max, min);

		// 출력 1번 - 기본 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println();

		// 출력 2번 - 확장 for문
		for (Integer i : list) { // int라고 적어도 가능. 언박싱이 되기 때문
			System.out.println(i);
		}
		System.out.println();

		// 출력 3번 - forEach() 메서드, 람다식
		list.forEach(i -> System.out.println(i)); // 실행문이 2개 이상이면 중괄호, 1개면 생략
		System.out.println();

		// 출력 4번 - forEach() 메서드, ::연산자 (람다식에서 사용하는 메서드 참조 연산자)
		list.forEach(System.out::println);

	}
}

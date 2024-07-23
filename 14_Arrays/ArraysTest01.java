import java.util.Arrays;

/*
< Arrays >
- 배열을 효과적으로 다룰 수 있도록 하는 다양한 메서드를 가지는 클래스
- 포함하고 있는 메서드들은 대부분 static으로 선언됨.
 */
public class ArraysTest01 {
	public static void main(String[] args) {
		int[] a1 = new int[5];

		// 배열의 내용 확인
		System.out.println(Arrays.toString(a1)); // [0, 0, 0, 0, 0]

		// 배열에 특정값 채움
		Arrays.fill(a1, 5);
		System.out.println(Arrays.toString(a1)); // [5, 5, 5, 5, 5]

		// 배열에 특정값을 람다식을 이용하여 다양하게 채움
		// 1~10 사이의 값으로 채움
		Arrays.setAll(a1, i -> 7);
		System.out.println(Arrays.toString(a1)); // [7, 7, 7, 7, 7]

		Arrays.setAll(a1, i -> (int) (Math.random() * 10) + 1);
		System.out.println(Arrays.toString(a1)); // [8, 9, 4, 8, 2]

		// 배열 복사
		// copyOf(원본, 개수): 원본의 개수만큼 복사한 새로운 배열을 생성
		// 0번 인덱스부터 개수만큼 복사
		int[] a2 = Arrays.copyOf(a1, a1.length);
		System.out.println(Arrays.toString(a2)); // [8, 9, 4, 8, 2]

		// 배열 복사
		// copyOfRange(원본, 시작 인덱스, 끝 인덱스): 원본에서 시작 인덱스부터 끝 인덱스 이전까지으 범위를 복사한 새로운 배열을 생성
		// 범위를 마음대로 지정
		int[] a3 = Arrays.copyOfRange(a1, 1, 4);
		System.out.println(Arrays.toString(a3)); // [9, 4, 8] 1~3까지 카피

		// 배열 정렬 - 전체 정렬, 오름차순 정렬
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1)); // [2, 4, 8, 8, 9]

		// 배열 정렬 - 범위 정렬
		// sort(원본, 시작 인덱스, 끝 인덱스)
		Arrays.sort(a2, 1, 4);
		System.out.println(Arrays.toString(a2)); //

		// 배열 정렬 - 내림차순 정렬
		// 기본 타입인 int형의 배열에는 적용이 안됨. -> Integer[]로 사용해야 함.
		Integer[] arr = new Integer[] { 50, 10, 30, 40, 20 };
		// Arrays.sort(arr, Collections.reverseOrder());
		Arrays.sort(arr, (a, b) -> b - a);
		System.out.println(Arrays.toString(arr)); // [50, 40, 30, 20, 10]

		// 배열 정렬 - 오름차순 정렬
		Arrays.sort(arr, (a, b) -> a - b);
		System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50]

		// binarySearch(배열, 찾는 값): 배열에서 찾는 값의 인덱스를 리턴,
		// - 오름차순으로 정렬되어 있을 때만 가능
		int idx = Arrays.binarySearch(arr, 20);
		System.out.println(idx); // 1

		Integer[] arr2 = Arrays.copyOf(arr, arr.length);
		Integer[] arr3 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr3, (a, b) -> b - a);
		Integer[] arr4 = new Integer[] { 10, 20, 30, 40, 55 };
		System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50]
		System.out.println(Arrays.toString(arr2)); // [10, 20, 30, 40, 50]
		System.out.println(Arrays.toString(arr3)); // [10, 20, 30, 40, 50]

		// 배열의 값을 비교
		// equals(배열1, 배열2): 배열1과 배열2의 각각의 요소가 모두 같을 때 treu로 판정
		System.out.println(Arrays.equals(arr, arr2)); // true
		System.out.println(Arrays.equals(arr, arr3)); // false (내림차순 정렬)
		System.out.println(Arrays.equals(arr, arr4)); // false (마지막 원소 값이 다름)
	}
}

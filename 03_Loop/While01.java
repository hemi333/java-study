/*
< 반복문 >
1. 초기값, 조건식, 증감값
2. 반복 횟수를 파악
*/
public class While01 {
	public static void main(String[] args) {

		// 1번 - 1부터 10까지 1씩 증가

//		int i = 1; // 초기값
//		while (i <= 10) { // 조건식
//			System.out.println(i + "Little Indean.");
//			i++; // 증감값
//		}

		// 2번 - 1부터 10까지 1씩 감소

//		int i = 10; // 초기값
//		while (i >= 1) { // 조건식
//			System.out.println(i + "Little Indean.");
//			i--; // 증감값
//		}

		// 3번 - 1부터 100까지 3씩 증가

//		int i = 1; // 초기값
//		while (i <= 100) { // 조건식
//			System.out.println(i + "Little Indean.");
//			i += 3; // 증감값
//		}

		// 4번 - 100부터 1까지 4씩 감소

		int i = 100; // 초기값
		while (i >= 1) { // 조건식
			System.out.println(i + "Little Indean.");
			i -= 4; // 증감값
		}

	}
}

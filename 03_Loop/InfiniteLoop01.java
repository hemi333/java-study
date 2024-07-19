
public class InfiniteLoop01 {
	public static void main(String[] args) {
		int i = 0;

		// 1번 - 무한루프
//		for (; true;) {
//			System.out.println(i++);
//		}

		// 2번 - 무한루프
		while (true) {
			System.out.println(i++);
		}
	}
}

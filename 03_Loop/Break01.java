// break문
// break문은 반복문 1개를 빠져나간다.
// break문은 switch~case문을 빠져나간다.
public class Break01 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("*");
		}
	}
}

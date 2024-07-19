import java.util.Scanner;

/* 
< switch ~ case ~ break문 >
1. switch ~ case 필수, break 선택
2. switch문의 조건은 실수를 제외한 모든 타입.
3. 특징: 조건이 정수 또는 문자열이고 가지 수가 2가지 이상으로 딱 떨어질 때 사용하는 것을 권장
4. break문을 만나면 switch문을 빠져 나간다.
*/
public class Switch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("계절 입력: ");
		String season = sc.next();

		switch (season) {
		case "봄":
			System.out.println("봄에는 꽃들이 피어나기 시작합니다.");
			break;
		case "여름":
			System.out.println("여름은 꽃들이 성장하여 만개하는 시기입니다.");
			break;
		case "가을":
			System.out.println("가을은 열매로 결실을 맺는 시기입니다.");
			break;
		case "겨울":
			System.out.println("겨울은 다음을 준비하는 중요한 시기입니다.");
			break;
		default:
			System.out.println("일년 중 중요하지 않은 계절은 없습니다.");
			break;
		}

		sc.close();

	}
}


// 1. 단일형 import
// - 각각의 클래스를 import 하는 방법
import java.util.Random;
import java.util.Scanner;

// 2. 주문형(On Demand) import
// - 같은 패키지 안에 있는 클래스를 한번에 import 하는 방법
//import java.util.*;

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("당신의 오늘 운수를 알아보세요.");
		System.out.print("정수 입력(0~9): ");
		int n = sc.nextInt();
		int rn = r.nextInt(10); // 0~9 사이의 정수 난수

		if (n == rn) {
			System.out.println("오늘은 행운의 날입니다.");
		} else {
			System.out.println("오늘은 평범한 날입니다.");
		}

		sc.close();
	}
}

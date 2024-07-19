/*
lang 패키지 (Math 등)
- 자바 프로그램을 작성할 때 필수적으로 필요한 클래스들을 모아 놓은 클래스
- 이 패키지 안에 있는 클래스를 사용할 때는 따로 import를 하지 않아도 자바 컴파일러가 알아서 import하여 사용함.
- Math, System, String, Exception, Object, Thread

< Math 클래스 >
- 수학 계산과 관련된 메서드와 상수를 모아 놓은 클래스
- 이 클래스 안의 모든 메서드와 상수는 static으로 선언되어 있음
- 이 클래스는 final로 선언됨 (클래스가 final이면 인스턴스 생성 불가, 상속 불가)

3. static import
- 클래스 안의 static 멤버를 클래스명 없이 사용하고자 할 때 사용하는 방법
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class ImportTest03 {
	public static void main(String[] args) {
		// Math: 수학 계산과 관련된 메서드와 값을 모아 놓은 클래스
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력: ");
		double radius = sc.nextDouble();
		System.out.print("x값 입력: ");
		int x = sc.nextInt();
		System.out.print("y값 입력: ");
		int y = sc.nextInt();
		System.out.print("음수값 입력: ");
		int z = sc.nextInt();

		double peri = 2 * PI * radius;
		double area = PI * radius * radius;
		double dist = sqrt(x * x + y * y);
		int n = abs(z);

		System.out.println("원의 둘레: " + peri);
		System.out.println("원의 면적: " + area);
		System.out.println("거리: " + dist);
		System.out.println("절대값: " + n);

		sc.close();
	}
}

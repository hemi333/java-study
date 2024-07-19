package test;

import wearable.Color;
import wearable.Wearable;
import wearable.WearableComputer;
import wearable.WearableRobot;

/*
문제) 아래의 작업 지시 사항을 준수하여 다형성을 구현하는 프로그램을 완성하시오.
1. WearableComputer와 WearableRobot의 인스턴스 각 2개씩 담는 배열을 생성하시오.(2가지 방법)
2. 반복문을 사용하여 각 인스턴스의 정보를 출력하시오. (2가지 방법)
3. WearableRobot인 경우는 색상을 바꾸는 기능을 함께 사용하시오.
 */

public class WearableTest01 {
	public static void main(String[] args) {
		// 배열 생성 1
		Wearable[] wears = new Wearable[4];
		wears[0] = new WearableComputer("suzy");
		wears[1] = new WearableComputer("hyemi");
		wears[2] = new WearableRobot(Color.RED);
		wears[3] = new WearableRobot(Color.YELLOW);

		// 배열 생성 2
		// Wearable[] wears = {
		// new WearableComputer("suzy"),
		// new WearableComputer("hyemi"),
		// new WearableRobot(Color.RED),
		// new WearableRobot(Color.YELLOW)
		// };

		for (int i = 0; i < wears.length; i++) {
			if (wears[i] instanceof Color) {
				((WearableRobot) wears[i]).changeColor(Color.GREEN);
			}
			wears[i].putOn();
			wears[i].putOff();
			System.out.println();
		}

		// 정보 출력
		for (Wearable w : wears) {
			if (w instanceof Color) {
				((WearableRobot) w).changeColor(Color.GREEN);
			}
			w.putOn();
			w.putOff();
			System.out.println();
		}

	}
}

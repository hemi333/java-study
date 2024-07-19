package test;

import shape.HorizontalLine;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.VerticalLine;

/*
문제) 아래의 작업 지시 사항을 준수하여 다형성을 구현하시오.
1. Shape 클래스의 자식 클래스인 4가지 도형의 인스턴스를 배열에 저장하시오. (2가지 방법)
2. 배열의 반복문을 사용하여  인스턴스의 정보를 출력하시오 (2가지 방법)
*/
public class ShapeTest01 {
	public static void main(String[] args) {
		// 인스턴스 배열에 저장 - 1번째 방법
		Shape[] shapes = new Shape[4];
		shapes[0] = new Point();
		shapes[1] = new Rectangle(7, 5);
		shapes[2] = new HorizontalLine(4);
		shapes[3] = new VerticalLine(6);

		// 인스턴스 배열에 저장 - 2번째 방법
		// Shape[] shapes = new Shape[] {
		// new Point(),
		// new Rectangle(7, 5),
		// new HorizontalLine(4),
		// new VerticalLine(6),
		// };

		// 배열의 반복문 사용하여 정보 출력 - 1번째 방법
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].print();
			System.out.println();
		}

		// 배열의 반복문 사용하여 정보 출력 - 2번째 방법
		for (Shape s : shapes) {
			s.print();
			System.out.println();
		}

	}
}

package test;

import pet.Pet;
import pet.RobbotPet;

/*
문제) 아래의 작업 지시 사항에 따라 다형성을 구현하는 프로그램을 완성하시오.
1. Pet, RobotPet 클래스의 인스턴스를 각 2개씩 담을 수 있는 배열을 만들어서 다형성을 구현하시오. (2가지 방법)
2. 배열에 있는 인스턴스를 반복문을 사용하여 출력하시오. (2가지 방법)
 */

public class PetTest02 {
	public static void main(String[] args) {
		// 다형성 구현 1
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("카이", "제니");
		pets[1] = new Pet("행성", "소녀");
		pets[2] = new RobbotPet("멍멍", "월E");
		pets[3] = new RobbotPet("왈왈", "주인 로봇");

		// 다형성 구현 2
		// Pet[] pets = new Pet[] {
		// new Pet("카이", "제니"),
		// new Pet("행성", "소녀"),
		// new RobbotPet("멍멍", "월E"),
		// new RobbotPet("왈왈", "주인 로봇")
		// };

		// for문 1
		// 완전한 다형성의 구현을 하는 방법
		// instanceof 연산자를 활용하여 자식 클래스에 추가된 기능도 구현이 가능
		for (int i = 0; i < pets.length; i++) {
			pets[i].introduce();
			// instanceof : 참조하고 있니~? RobbotPet형이니~?
			// pets[i]가 RobbotPet의 인스턴스라면, pet[i]가 RobbotPet을 참조한다면
			if (pets[i] instanceof RobbotPet) {
				// RobbotPet형으로 타입 변환(캐스팅)
				((RobbotPet) pets[i]).work(1);
			}
			System.out.println();
		}

		// for문 2
		for (Pet p : pets) {
			p.introduce();
			if (p instanceof RobbotPet) {
				((RobbotPet) p).work(3);
			}
			System.out.println();
		}

	}
}

package test;

import animal.Animal;
import animal.Cat;
import animal.Dog;

/*
문제) 아래의 작업 지시 사항을 준수하여 추상 클래스의 다형성 구현을 프로그램하시오.
1. 클래스의 배열을 생성하고, 자식 인스턴스 각 2개를 생성하여 담으시오.
2. 반복문을 사용하여, 배열 안의 인스턴스의 정보를 출력하시오 (2가지 방법)
아니 문제를 좀 명확하게 줘 디자이너냐고
 */
public class AnimalTest01 {
	public static void main(String[] args) {
		// 다형성 방법 1
		Animal[] animals = new Animal[4];
		animals[0] = new Dog("멍개", "시고르자브종");
		animals[1] = new Dog("예삐", "말티즈");
		animals[2] = new Cat("냐옹", 3);
		animals[3] = new Cat("메옹", 2);

		// 다형성 방법 2
		// Animal[] animals = new Animal[] {
		// new Dog("멍개", "시고르자브종"),
		// new Dog("예삐", "말티즈"),
		// new Cat("냐옹", 3),
		// new Cat("메옹", 2),
		// };

		// for문 1번
		for (int i = 0; i < animals.length; i++) {
			animals[i].introduce();
		}
		System.out.println();

		// for문 2번 (확장for문)
		for (Animal a : animals) {
			a.introduce();
		}
	}
}

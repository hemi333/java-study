package test;

import member.Member;
import member.SpecialMember;

/*
문제) 아래의 작업 지시를 따라 프로그램을 작성하시오.
1. 부모 클래스인 Member 클래스를 작성하시오.
- 인스턴스 변수 : name(회원이름), no(회원번호), age(회원나이)
- 인스턴스 변수를 초기화하는 생성자 생성
- 인스턴스 변수를 설정하고 반환하는 getter/setter 메서드 생성
- 2가지 형태로 출력하는 출력 메서드 생성 : toString(), showInfo()
2. Member 클래스를 상속하는 자식 클래스 SpecialMember 클래스를 작성하시오.
- 인스턴스 변수: privilege(특별혜택)
- 인스턴스 변수를 초기화하는 생성자 생성
- 인스턴스 변수를 설정하고 반환하는 getter/setter 메서드 생성
- 2가지 형태의 출력 메서드는 오버라이딩하여 생성
3. main 메서드에서 Member와 SpecialMember 클래스의 인스턴스를 각 2개씩 만들고
각 2가지의 출력 메서드를 활용하여 인스턴스의 정보를 확인하시오.
4. 모든 멤버 변수는 private, 멤버 변수를 제외한 멤버는 public 접근 제어자를 사용하시오.
*/
public class MemberTest02 {
	public static void main(String[] args) {
		// 다형성 구현 1
//		Member[] members = new Member[4];
//		members[0] = new Member("지수", "123", 25);
//		members[1] = new Member("로제", "456", 25);
//		members[2] = new SpecialMember("제니", "321", 25, "제니 사랑해");
//		members[3] = new SpecialMember("혜미", "321", 31, "초대권 증정");

		// 다형성 구현 2
		Member[] members = new Member[] { new Member("지수", "123", 25), new Member("로제", "456", 25),
				new SpecialMember("제니", "321", 25, "제니 사랑해"), new SpecialMember("혜미", "321", 31, "초대권 증정") };

		// 반복문 활용 1 - 기본 for문
		for (int i = 0; i < members.length; i++) {
			// System.out.println(members[i]); // toString() 생략가능
			// members[i].showInfo(); System.out.println();
		}

		// 반복문 활용 2 - 확장 for문(향상된 for문, for-in문)
		for (Member m : members) {
			System.out.println(m);
		}

//		// 다형성 구현하지 않고 각각 출력
//		Member m1 = new Member("지수", "123", 25);
//		Member m2 = new Member("로제", "456", 25);
//		SpecialMember m3 = new SpecialMember("제니", "321", 25, "제니 사랑해");
//		SpecialMember m4 = new SpecialMember("혜미", "321", 31, "초대권 증정");
//
//		// 출력 1번
//		System.out.println(m1.toString());
//		System.out.println(m2.toString());
//		System.out.println(m3.toString());
//		System.out.println(m4.toString());
//		System.out.println();
//
//		// 출력 2번
//		System.out.println(m1);
//		System.out.println(m2);
//		System.out.println(m3);
//		System.out.println(m4);
//
//		// 출력 3번
//		m1.showInfo();
//		System.out.println();
//		m2.showInfo();
//		System.out.println();
//		m3.showInfo();
//		System.out.println();
//		m4.showInfo();
//		System.out.println();

	}
}

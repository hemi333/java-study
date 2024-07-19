// 문제) 회원 클래스를 만들고, 인스턴스 3개 생성하여 멤버변수의 값을 출력하시오.
// 멤버변수: 이름(name), 회원 번호(no), 나이(age)
// 생성자, getter, setter, 멤버 출력 메서드
class Member {
	private String name;
	private String no;
	private int age;

	public Member(String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 멤버 출력 메서드 1번
	public void printMember() {
		System.out.printf("회원명: %s, 번호: %s, 나이: %d\n", name, no, age);
	}

	// 멤버 출력 메서드 2번
	public String toString() {
//		return "회원명: " + name + ", 번호: " + no + ", 나이: " + age;
		return String.format("회원명: %s, 번호: %s, 나이: %d", name, no, age);
	}
}

public class MemberTest01 {

	public static void main(String[] args) {
		Member m1 = new Member("김혜미", "1", 31);
		Member m2 = new Member("이지아", "2", 24);
		Member m3 = new Member("육치성", "3", 40);

		m1.printMember();
		m2.printMember();
		m3.printMember();

		System.out.println(m1); // .toString() 안써도 error 발생하지 않음
		System.out.println(m2);
		System.out.println(m3.toString());
	}

}

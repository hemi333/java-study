import java.util.HashSet;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// setter
	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int age) {
		this.age = age;
	}

	// 클래스를 set에서 사용한다면 Object 클래스의 hashCode(), equals() 메서드를 오버라이딩 해야 한다.
	// Person 인스턴스는 name과 age가 같을 때 같은 해시코드를 생성하도록 한다.
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.name.equals(p.name) && this.age == p.age;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("%s(%d)", name, age);
	}

}

public class HashSetTest03 {
	public static void main(String[] args) {
		// Person 인스턴스를 지정하는 해시셋 생성
		HashSet<Person> set = new HashSet<>();

		// 데이터 추가
		Person[] persons = { new Person("박준우", 35), new Person("유호진", 38), new Person("달시오크", 41),
				new Person("패트릭콘", 39), new Person("한설희", 36), new Person("에덴", 24), new Person("DK", 42) };
		for (Person p : persons) {
			set.add(p);
		}

		// 데이터 확인
		System.out.println(set); // [유호진(38), 한설희(36), 에덴(24), 패트릭콘(39), 박준우(35), 달시오크(41), DK(42)]
		System.out.println("크기: " + set.size()); // 크기: 7

		// 중복 데이터 추가 - 이름만 중복 -> 허용함
		set.add(new Person("박준우", 40));
		System.out.println(set); // [유호진(38), 한설희(36), 에덴(24), 패트릭콘(39), 박준우(35), 달시오크(41), DK(42), 박준우(40)]
		System.out.println("크기: " + set.size()); // 크기: 8

		// 중복 데이터 추가 - 나이만 중복 -> 허용함
		set.add(new Person("김현준", 42));
		System.out.println(set); // [유호진(38), 한설희(36), 에덴(24), 패트릭콘(39), 박준우(35), 달시오크(41), DK(42), 김현준(42),
									// 박준우(40)]
		System.out.println("크기: " + set.size()); // 크기: 9

		// 중복 데이터 추가 - 이름과 나이 모두 중복 -> 허용됨(안돼!) -> hashCode, equals Override후 해결
		// 문제점: 멤버변수의 값이 모두 같음에도 다른 데이터로 인식하여 데이를 추가함.
		// 해결책: 클래스에서 hashCode() 메서드와 equals() 메서드를 오버라이딩 하여 문제를 해결함.
		set.add(new Person("유호진", 38));
		System.out.println(set); // [유호진(38), 한설희(36), 에덴(24), 패트릭콘(39), 박준우(35), 달시오크(41), DK(42), 김현준(42),
									// 박준우(40)]
		System.out.println("크기: " + set.size()); // 크기: 9
	}
}

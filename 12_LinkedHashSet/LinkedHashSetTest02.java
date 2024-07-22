import java.util.HashSet;
import java.util.LinkedHashSet;

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

public class LinkedHashSetTest02 {
	public static void main(String[] args) {
		// Person 인스턴스를 지정하는 해시셋 생성
		HashSet<Person> set1 = new HashSet<>();
		LinkedHashSet<Person> set2 = new LinkedHashSet<>();

		set1.add(new Person("박준우", 35));
		set1.add(new Person("유호진", 38));
		set1.add(new Person("달시오크", 41));
		set1.add(new Person("패트릭콘", 39));
		set1.add(new Person("한설희", 36));

		set2.add(new Person("박준우", 35));
		set2.add(new Person("유호진", 38));
		set2.add(new Person("달시오크", 41));
		set2.add(new Person("패트릭콘", 39));
		set2.add(new Person("한설희", 36));

		System.out.println(set1); // [박준우(35), 한설희(36), 패트릭콘(39), 달시오크(41), 유호진(38)]
		System.out.println(set2); // [박준우(35), 유호진(38), 달시오크(41), 패트릭콘(39), 한설희(36)]
	}
}

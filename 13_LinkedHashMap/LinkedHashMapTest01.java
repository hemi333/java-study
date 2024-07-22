import java.util.LinkedHashMap;

class Member {
	private String id;
	private String name;
	private int age;

	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// getter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// setter
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// HashMap에서 중복키를 허용하지 않으려면, hashCode()와 equals() 메서드를 오버라이딩 해야 한다.
	@Override
	public int hashCode() {
		return (id + name + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			// 아이디, 이름, 나이가 모두 같을 때
//			return this.id.equals(m.id) && this.name.equals(m.name) && this.age == m.age;
			// 아이디만 같을 때
			return this.id.equals(m.id);
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("%s(%s, %d)", id, name, age);
	}
}

public class LinkedHashMapTest01 {
	public static void main(String[] args) {
		// 키 : 회원, 값 : 전화번호
		LinkedHashMap<Member, String> map = new LinkedHashMap<>();

		// 데이터 추가
		map.put(new Member("123456", "박준우", 26), "010-1111-1111");
		map.put(new Member("456789", "유호진", 35), "010-2222-2222");
		map.put(new Member("789123", "달시오크", 25), "010-3333-3333");
		map.put(new Member("789456", "패트릭콘", 31), "010-4444-4444");
		map.put(new Member("456123", "한설희", 32), "010-5555-5555");
		map.put(new Member("123789", "에덴", 29), "010-6666-6666");
		map.put(new Member("987654", "DK", 27), "010-7777-7777");

		// 확인
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 7
	}
}

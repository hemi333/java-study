import java.util.HashMap;

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

/*
< HashMap과 HashTable의 관계 >
1. 기본 사용법은 완전 동일
2. Hashtable: 멀티 쓰레드를 지원하고, 쓰레드의 동기화를 지원함. 멀티 쓰레드를 사용하지 않을 때는 성능의 저하가 발생
   HashMap  : 멀티 쓰레드와 쓰레드의 동기화를 제거하여 성능 향상시킴. 일반적인 경우는 HashMap을 사용함.
  
< HashMap과 LinkedHashMap의 관계 >
1. 기본 사용법은 완전 동일
2. Hashtable: 순서가 없음(입력한대로 출력되지 않음)
   HashMap  : 순서가 있음(입력한대로 출력함)
 */
public class HashMapTest04 {
	public static void main(String[] args) {
		// 키 : 회원, 값 : 전화번호
		HashMap<Member, String> map = new HashMap<>();

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

		// 중복키 - 아이디가 동일 -> 추가
		map.put(new Member("123456", "김현준", 41), "010-1234-1234");
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 8

		// 중복키 - 이름이 동일 -> 추가
		map.put(new Member("123470", "유호진", 45), "010-2345-2345");
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 9

		// 중복키 - 나이가 동일 -> 추가
		map.put(new Member("123471", "에릭치엔", 27), "010-3456-3456");
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 10

		// 중복키 - 아이디, 이름, 나이가 모두 동일 -> 추가되지 않기 위해 hashCode()와 equals() 메서드를 오버라이딩
		map.put(new Member("123456", "박준우", 26), "010-4567-4567");
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 10
	}
}

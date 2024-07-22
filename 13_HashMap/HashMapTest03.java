import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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

	@Override
	public String toString() {
		return String.format("%s(%s, %d)", id, name, age);
	}
}

public class HashMapTest03 {
	public static void main(String[] args) {
		// 키: 전화번호, 값: 회원
		HashMap<String, Member> map = new HashMap<>();
		// 데이터 추가
		map.put("010-1111-1111", new Member("123456", "박준우", 26));
		map.put("010-2222-2222", new Member("456789", "유호진", 35));
		map.put("010-3333-3333", new Member("789123", "달시오크", 25));
		map.put("010-4444-4444", new Member("789456", "패트릭콘", 31));
		map.put("010-5555-5555", new Member("456123", "한설희", 32));
		map.put("010-6666-6666", new Member("123789", "에덴", 29));
		map.put("010-7777-7777", new Member("987654", "DK", 27));

		// 출력 1
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String tel = it.next(); // 키: 전화번호
			Member m = map.get(tel); // 값: 회원
			System.out.println(tel + " : " + m);
		}
		System.out.println("회원수: " + map.size()); // 회원수: 7
		System.out.println("-----");

		// 존재하지 않는 데이터 추가 -> 값을 추가 -> null 리턴
		System.out.println(map.put("010-8888-8888", new Member("123463", "아리웰", 22))); // null
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 8

		// 중복 키를 허용하지 않음 -> 값을 수정 -> 이전 값을 리턴
		System.out.println(map.put("010-3333-3333", new Member("123458", "에릭치엔", 35))); // 789123(달시오크, 25)
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 8

		// 010-5555-5555 키를 가진 회원의 회원번호를 123478, 나이를 41로 수정

		// 값의 추가와 수정
		// 키가 없을 때는 null, 키가 있을 때는 키에 대한 값을 리턴
		Member m = map.get("010-5555-5555");
		if (m == null) {
			System.out.println("입력한 전화번호는 없는 데이터입니다.");
		} else { // 수정
			String name = m.getName();
			map.put("010-5555-5555", new Member("123478", name, 41));
		}
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 8

		// 데이터의 삭제
		// 010-8888-8888 키에 대한 데이터를 삭제
		if (map.remove("010-8888-8888") == null) {
			System.out.println("입력한 전화번호는 없는 데이터입니다.");
		} else {
			System.out.println("해당 데이터가 삭제되었습니다.");
		}
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 7

		// 출력 2
		Set<Map.Entry<String, Member>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Member>> it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Member> entry = it2.next();
			String tel = entry.getKey();
			Member member = entry.getValue();
			System.out.printf("%s : %s\n", tel, member);
		}
		System.out.println("-----");

		// 출력 3
		Set<Map.Entry<String, Member>> entrySet2 = map.entrySet();
		for (Map.Entry<String, Member> member2 : entrySet2) {
			String tel = member2.getKey();
			Member member = member2.getValue();
			System.out.printf("%s : %s\n", tel, member);
		}
		System.out.println("-----");

		// 출력 4
		map.forEach((k, v) -> System.out.printf("%s: %s\n", k, v));
	}
}

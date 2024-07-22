import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Member implements Comparable<Member> {
	private String id;
	private String name;
	private int age;

	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Member(String id) {
		this.id = id;
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

	// id를 기준으로 오름차순
	@Override
	// this의 매개변수를 비교할 때 this가 클 때 양수, 작을 때 음수, 같을 때 0을 리턴하면 오름차순 정렬
	// 반대로 하면 내림차순 정렬
	public int compareTo(Member m) {
		if (this.id.compareTo(m.id) < 0)
			return -1;
		else if (this.id.compareTo(m.id) > 0)
			return 1;
		else
			return 0;
	}

//	// age를 기준으로 오름차순
//	public int compareTo(Member m) {
//		if (this.age - m.age) < 0)
//			return -1;
//		else if (this.name.compareTo(m.id) > 0)
//			return 1;
//		else
//			return 0;
//	}
}

// * 문제) 아래의 작업 지시 사항을 준수하여 프로그램을 완성하시오.
// * 1. Member를 키, 전화번호를 값으로 하는 TreeMap인 map을 완성하시오.
// * 2. 데이터를 7개 추가하여 TreeMap의 특징을 확인하시오.
// * 3. 키와 값의 중복을 확인하시오.
// * 4. 키에 해당하는 데이터를 삭제하시오.
// * 5. 4가지 출력 방법으로 출력하시오.

public class TreeMapTest07 {
	public static void main(String[] args) {
		// 키: Member, 값: 전화번호
		TreeMap<Member, String> map = new TreeMap<>();

		// 데이터 추가
		map.put(new Member("123456", "박준우", 26), "010-1111-1111");
		map.put(new Member("456789", "유호진", 35), "010-2222-2222");
		map.put(new Member("789123", "달시오크", 25), "010-3333-3333");
		map.put(new Member("789456", "패트릭콘", 31), "010-4444-4444");
		map.put(new Member("456123", "한설희", 32), "010-5555-5555");
		map.put(new Member("123789", "에덴", 29), "010-6666-6666");
		map.put(new Member("987654", "DK", 27), "010-7777-7777");

		// 확인 - key를 기준으로 오름차순 정렬
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 7

		// 키의 중복 확인 - compareTo()에서 비교한 멤버를 기준으로 같은 키의 중복을 허용하지 않음.
		// 키는 변경하지 않고, 값은 수정함 (덮어씀)
		map.put(new Member("123456", "박준우", 26), "010-8888-8888");
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 7

		// 값의 중복 확인 - 허용
		map.put(new Member("753159", "김혜미", 31), "010-1111-1111");
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 8

		// 키의 데이터 삭제 - compareTo()에서 비교한 멤버 변수를 기준으로 같은 키의 삭제를 허용함.
		map.remove(new Member("123456", "박준우", 26));
		System.out.println(map);
		System.out.println("회원수: " + map.size()); // 회원수: 7

		// 출력 1
		Set<Member> keySet = map.keySet();
		Iterator<Member> it = keySet.iterator();
		while (it.hasNext()) {
			Member m = it.next(); // 키: 전화번호
			String tel = map.get(m); // 값: 회원
			System.out.println(m + " : " + tel);
		}
		System.out.println("-----");

		// 출력 2
		Set<Map.Entry<Member, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Member, String>> it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Map.Entry<Member, String> entry = it2.next();
			Member member = entry.getKey();
			String tel = entry.getValue();
			System.out.printf("%s : %s\n", member, tel);
		}
		System.out.println("-----");

		// 출력 3
		Set<Map.Entry<Member, String>> entrySet2 = map.entrySet();
		for (Map.Entry<Member, String> member2 : entrySet2) {
			Member member = member2.getKey();
			String tel = member2.getValue();
			System.out.printf("%s : %s\n", member, tel);
		}
		System.out.println("-----");

		// 출력 4
		map.forEach((k, v) -> System.out.printf("%s: %s\n", k, v));

	}
}

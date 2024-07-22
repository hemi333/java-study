import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
/*
문제) 아래의 작업 지시 사항을 준수하여 프로그램을 완성하시오.
1. (o)한영 사전을 HashMap으로 구현하시오. (키: 한글, 값: 영어) ex) 사과 : apple
2. (o)데이터를 10개 추가하시오.
3. (o)키를 찾아서 데이터를 삭제하도록 구현하시오.
4. (o)키에 대한 값을 수정하도록 구현하시오.
5. (o)3가지 방법으로 출력하시오.

-> CRUD되는 Map 프로그램을 구현하시오.
 */
import java.util.Set;

public class HashMapTest02 {
	public static void main(String[] args) {
		// 한영사전, 키: 한글, 값: 영어
		HashMap<String, String> dic = new HashMap<>();

		// 데이터 10개 추가
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("딸기", "strawberry");
		dic.put("블루베리", "blueberry");
		dic.put("키위", "kiwi");
		dic.put("망고", "mango");
		dic.put("파인애플", "fineapple");
		dic.put("토마토", "tomato");
		dic.put("복숭아", "peach");
		dic.put("포도", "graph");
		System.out.println(dic);

		// 키를 찾아서 데이터를 삭제하도록 구현
		// dic.remove("사과");
		// System.out.println(dic);

		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 데이터를 입력하세요.");
		String word = sc.next();

		if (dic.remove(word) == null) {
			System.out.println("단어가 존재하지 않습니다.");
		} else {
			System.out.println("삭제 되었습니다.");
		}

		// 키에 대한 값을 수정하도록 구현 -> 중복키를 입력하면 값이 수정
		dic.put("포도", "nono");
		System.out.println(dic);

		// 3가지 방법으로 출력
		System.out.println("--- 출력1 ---");
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String kor = it.next();
			String eng = dic.get(kor);
			System.out.printf("%s : %s\n", kor, eng);
		}

		System.out.println("--- 출력2 ---");
		Set<Map.Entry<String, String>> entrySet = dic.entrySet();
		Iterator<Map.Entry<String, String>> it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, String> entry = it2.next();
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.printf("%s : %s\n", kor, eng);
		}

		System.out.println("--- 출력3 ---");
		Set<Map.Entry<String, String>> entrySet2 = dic.entrySet();
		for (Map.Entry<String, String> entry : entrySet2) {
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.printf("%s : %s\n", kor, eng);
		}
	}
}

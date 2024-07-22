package test;

import java.util.TreeSet;

import fruit.Fruit;

/*
Exception in thread "main" java.lang.ClassCastException: fruit.Fruit cannot be cast to java.lang.Comparable
-> TreeSet에 사용자가 정의한 클래스를 넣어서 사용하려면 Comparable 인터페이스를 구현하라.
 */

public class TreeSetTest06 {
	public static void main(String[] args) {
		// Fruit 인스턴스를 저장하는 TreeSet 생성
		TreeSet<Fruit> set = new TreeSet<>();

		// 과일 인스턴스를 추가
		set.add(new Fruit("사과", 1000, 35));
		set.add(new Fruit("자두", 3000, 53));
		set.add(new Fruit("포도", 6000, 27));
		set.add(new Fruit("망고", 4500, 30));
		set.add(new Fruit("참외", 2700, 28));

		// 확인
		System.out.println(set); // java.lang.ClassCastException 에러 발생 -> implements Comparable<Fruit>로 해결
		System.out.println("크기: " + set.size()); // 크기: 5

		// 중복 데이터 추가
		// Fruit 클래스에서 Compareable의 compareTo() 메서드를 오버라이딩 할 때 과일 이름인 name을 기준으로 정렬하도록
		// 구현하였으므로, 과일 이름이 같을 때 -> 중복을 허용하지 않음
		// 새로 만든 데이터가 추가되지 않고, 기존 데이터를 유지하고 있다.
		set.add(new Fruit("사과", 2000, 40));
		System.out.println(set);
		System.out.println("크기: " + set.size()); // 크기: 5

		// Compareable 정렬기준으로 판단하네~~

		// 새로운 과일이름으로 추가
		set.add(new Fruit("수박", 15000, 20));
		System.out.println(set);
		System.out.println("크기: " + set.size()); //
	}
}

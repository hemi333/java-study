/*
StringBuilder 클래스
- StringBuffer 클래스와 사용 방법이 거의 동일
- StringBuffer 클래스는 멀티 쓰레드의 동기화에 대해 안전하도록 설계 되어 있음 -> 성능의 저하가 발생할 수 있다.
- StringBuffer에서 쓰레드의 동기화 부분을 제외하고 설계하여, 성능을 향상시킴
- 만약, 쓰레드의 동기화가 필요한 시스템이라면 반드시 StringBuffer를 사용해야 함.
 */
public class StringBuilderTest01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("Hello");
		sb.append("Java");
		System.out.println(sb);
	}
}


public class StringTest13 {
	public static void main(String[] args) {
		/*
		%d: 10인 정수, decimal
		%f: 실수, float
		%c: 문자, character
		%s: 문자열, string
		
		%x: 16진수, hexadecimal
		%o: 8진수, octal
		*/

		String job = "배드민턴 국가대표";
		String name = "안세영";
		char gender = 'F';
		int rank = 1;
		double speed = 493.5;

		String info = String.format("이름: %s, 직업: %s, 성별: %c, 세계랭킹: %d, 셔틀콕 속도: %.2f", name, job, gender, rank, speed);
		System.out.println(info);
	}
}

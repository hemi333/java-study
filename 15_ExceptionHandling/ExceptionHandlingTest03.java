import java.util.Arrays;

/*
< 여러 가지 예외가 발생할 때 처리 방법 >
1. 모든 예외의 부모가 되는 예외를 통해 처리 -> Exception
- 장점: 모든 예외를 한꺼번에 처리
- 단점: 각 자식 예외의 정확한 처리는 불가능할 수 있음.
- 모든 예외에 대해서 동일한 처리를 한다면 좋은 방법이 될 수도 있음.

2. 모든 예외에 대해서 각각의 catch 블록으로 처리
- 장점: 각각의 예외에 대한 정확한 처리를 할 수 있음
- 단점: catch 블럭이 많아져서 코드가 길어짐.

3. 알려진 중요한 예외는 각각 처리하고, 나머지 예외는 부모인 Exception을 통해서 처리
-> 1번과 2번의 장점을 모두 가짐 -> 추천
-> 부모인 Exception은 자식을 먼저 쓰고 난 후 맨 마지막에 사용해야 함.

< 예외 발생 처리 순서 >
- catch 블럭이 여러 개 있어도 하나의 catch 블럭을 처리하면 나머지는 들어가지 않음
1. 예외가 발생하지 않았을 때: try -> finally -> 마지막 처리
2. NumberFormatException 예외가 발생했을 때: try -> catch(NumberFormatException) -> finally -> 마지막 처리
3. ArrayIndexOutOfBoundsException 예외가 발생했을 때: try -> catch(ArrayIndexOutOfBoundsException) -> finally -> 마지막 처리
4. 기타 예외가 발생했을 때: try -> catch(Exception) -> finally -> 마지막 처리

< try ~ catch문의 사용 방법 >
- 1번, 2번: 단일 try ~ catch문
- 3번, 4번: 다중 try ~ catch문
1. try ~ catch
2. try ~ catch ~ finally
3. try ~ catch ~ catch ...
4. try ~ catch ~ catch ... finally
 */

// 문제) 학생 점수를 지정한 문자열에서 학생 점수와 총점, 평균을 구할 때 발생할 수 있는 예외를 찾아서
// 예외처리를 하여 정삭적으로 프로그램을 구현하도록 프로그래밍하시오.

public class ExceptionHandlingTest03 {
	public static void main(String[] args) {
		String str = "95,88-75/66,82|93.5";
		int tot = 0;
		double ave = 0.0;

		// 1. 특수기호를 하나의 기호로 바꿈
		str = str.replaceAll("[-/|]", ",");
		System.out.println(str);

		// 2. 문자열을 기호로 구분하여 문자열의 배열을 생성
		String[] scores = str.split(",");
		System.out.println(Arrays.toString(scores));

		// 3. 출력, 총점 -> 예외가 발생
		// ArrayIndexOutOfBoundsException, NumberFormatException 2가지 예외 발생
		try {
			for (int i = 0; i <= scores.length; i++) {
				System.out.println(i + 1 + "번 학생 점수: " + scores[i]);
				tot += Integer.parseInt(scores[i]);
			}
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage() + "번은 없습니다.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			// 결과
			ave = (double) tot / scores.length - 1;
			System.out.println("총점: " + tot);
			System.out.println("평균: " + ave);
		}

		// 마지막 처리
		System.out.println();

	}
}

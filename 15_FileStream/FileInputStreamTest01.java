import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
	public static void main(String[] args) /* throws FileNotFoundException */ { // 예외 처리 안하면 오류 발생
		// 파일 입력 1번
		// - 단점: 예외처리 부분이 복잡
//		FileInputStream fis = null;
//
//		try {
//			fis = new FileInputStream("C:/hm240522/temp/test01.txt");
//			int data = 0;
//			while ((data = fis.read()) != -1) { // -1: EOF(End Of File)
//				char c = (char) data;
//				System.out.print(c);
//				System.out.print(data); // 아스키 코드 출력
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) { // IOException안에 FileNotFoundException가 있다.
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		// 파일 입력 2번
		// - 장점 : finally문 제거하여 코드가 비교적 간결해짐.
		// - 단점 : finally가 가지는 상징성은 없어짐.
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("C:/hm240522/temp/test01.txt");
//			int data = 0;
//			while ((data = fis.read()) != -1) { // -1: EOF(End Of File)
//				char c = (char) data;
//				System.out.print(c);
//				System.out.print(data); // 아스키 코드 출력
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) { // IOException안에 FileNotFoundException가 있다.
//			e.printStackTrace();
//		}

		// 파일 입력 3번
		// try-with-resource 방법
		// - 자동으로 리소스를 닫아줌
		// - finally 블럭을 사용하여 리소스를 확실히 닫는 것과 같은 효과를 줌.
		// - 자바 1.7버전부터 도입됨.
		try (FileInputStream fis = new FileInputStream("C:/hm240522/temp/test01.txt")) {
			int data = 0;
			while ((data = fis.read()) != -1) { // -1: EOF(End Of File)
				char c = (char) data;
				System.out.print(c);
				System.out.print(data); // 아스키 코드 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // IOException안에 FileNotFoundException가 있다.
			e.printStackTrace();
		}
	}
}

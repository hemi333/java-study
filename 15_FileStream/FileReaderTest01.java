import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
	public static void main(String[] args) {
		// try-with-resource

		try (FileInputStream fis = new FileInputStream("C:/hm240522/temp/test01.txt");
				FileReader fr = new FileReader("C:/hm240522/temp/test01.txt");) {

			int data = 0;
			// 바이트 스트림 -> 한글이 깨짐
			System.out.println("--- 바이트 스트림 입력 ---");
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();

			// 문자 스트림 -> 한글이 정상적으로 출력, 한글 문자가 포함된 파일일 때 사용함
			System.out.println("--- 문자 스트림 입력 ---");
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}

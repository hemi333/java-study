import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderTest01 {
	public static void main(String[] args) {
		// try-with-resource

		try (BufferedReader br = new BufferedReader(new FileReader("C:/Windows/system.ini"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Windows/temp/system.ini"));)

		{
			int data = 0;
			while ((data = br.read()) != -1) {
				bw.write(data);
			}
			System.out.println("문자 파일을 읽고 썼습니다.(문자 파일 복사)");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest01 {
	public static void main(String[] args) {
		// 1번 방법 - try-catch-finally
		// 파일 입출력 스트림
		FileInputStream fis = null;
		FileOutputStream fos = null;

		// 보조 파일 입출력 스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("C:/hm240522/temp/jdk.exe");
			fos = new FileOutputStream("C:/hm240522/temp/jdk_copy.exe");

			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			int data = 0;
			System.out.println("복사 시간을 측정합니다.");
			System.out.println("-----------------");
			long startTime = System.currentTimeMillis();
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("-----------------");
			System.out.println("복사 시간 측정이 끝났습니다.");
			System.out.printf("복사 시간: %d\n", (endTime - startTime) / 1000);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			// 보조 스트림을 닫으면 파일 입출력 스트림도 함께 닫는다.
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}

		}
	}
}

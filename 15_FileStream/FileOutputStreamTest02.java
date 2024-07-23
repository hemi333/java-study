import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest02 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("C:/hm240522/temp/jdk.exe");
				FileOutputStream fos = new FileOutputStream("C:/hm240522/temp/jdk_copy.exe");) {
			int data = 0;
			System.out.println("복사 시간을 측정합니다.");
			System.out.println("-----------------");
			long startTime = System.currentTimeMillis();
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("-----------------");
			System.out.println("복사 시간 측정이 끝났습니다.");
			System.out.printf("복사 시간: %d\n", (endTime - startTime) / 1000);
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (IOException e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
}

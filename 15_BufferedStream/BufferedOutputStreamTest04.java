import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest04 {
	public static void main(String[] args) {
		// try-catchs
		BufferedOutputStream bos = null;

		try {
			// 버퍼의 크기 5로 설정
			bos = new BufferedOutputStream(new FileOutputStream("C:/hm240522/temp/test02.txt"), 5); // 12345만 입력됨
			for (int i = '1'; i < '9'; i++) {
				bos.write(i);
			}
			// flush: 메모리의 버퍼에 남아있는 데이터를 강제로 쓰도록 하는 작업
			bos.flush(); // 12345678 (버퍼에 남은 내용을 강제로 밀어넣는다.)
			System.out.println("문자 파일에 쓰기가 완료되었습니다.");

			// 닫는 작업 생략 -> 버퍼의 크기만큼만 실행
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

import java.io.File;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) {
		File f1 = new File("C:/hm240522/temp/jdk.exe"); // 파일
		File f2 = new File("C:/hm240522/temp/sample"); // 폴더(존재하지 않음)
		File f3 = new File("C:/hm240522/temp"); // 폴더(존재함)
		File f4 = new File("C:/hm240522/temp/hello.txt"); // 파일(존재하지 않음)

		// 파일인지 디렉토리(폴더)인지 여부
		String result = null;
		if (f1.isFile())
			result = "파일";
		else
			result = "디렉토리";
		System.out.println(f1.getName() + "은 " + result + "입니다."); // jdk.exe은 파일입니다.

		// 디렉토리인지 파일인지 여부
		if (f3.isDirectory())
			result = "디렉토리";
		else
			result = "파일";
		System.out.println(f3.getName() + "은 " + result + "입니다."); // temp은 디렉토리입니다.

		// 디렉토리 존재 유무 -> 없다면 생성 성공, 있다면 생성 실패
		if (!f2.exists()) { // 없다면 -> 디렉토리 생성
			f2.mkdir();
			System.out.println(f2.getName() + " 디렉토리가 생성되었습니다.");
		} else {
			System.out.println(f2.getName() + " 디렉토리가 이미 존재합니다.");
		}

		// 파일 존재 유무 -> 없다면 생성 성공, 있다면 생성 실패
		// 파일 추가
		if (!f4.exists()) { // 없다면 -> 파일 생성
			try {
				f4.createNewFile(); // 위험한 명령이니 try catch문 사용
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(f4.getName() + " 파일이 생성되었습니다.");
		} else {
			System.out.println(f4.getName() + " 파일이 이미 존재합니다.");
		}

		// 디렉토리 안의 모든 정보
		System.out.println("--- directory 정보 ---");
		String[] fileList = f3.list();
		for (String s : fileList) {
			File f = new File(f3, s);
			long t = f.lastModified();
			System.out.print(s + " ");
			System.out.print("파일 크기: " + f.length() + " // ");
			System.out.printf("수정 시간: %ty/%tb/%td (%ta요일) %tT\n", t, t, t, t, t);
			// jdk.exe 파일 크기: 157865576 // 수정 시간: 24/7월/23 (화요일) 18:16:50
			// test01.txt 파일 크기: 41 // 수정 시간: 24/7월/23 (화요일) 17:17:50
			// test02.txt 파일 크기: 8 // 수정 시간: 24/7월/24 (수요일) 11:13:11
		}

		// 파일명 변경
		if (f4.renameTo(new File("C:/hm240522/temp/happy.txt"))) {
			System.out.println("파일명을 변경하였습니다.");
		} else {
			System.out.println("파일명 변경에 실패하였습니다.");
		}

		// 파일 삭제
		File f5 = new File("C:/hm240522/temp/happy.txt");
		if (f5.delete()) {
			System.out.println("파일을 삭제하였습니다.");
		} else {
			System.out.println("파일 삭제에 실패하였습니다.");
		}
	}
}

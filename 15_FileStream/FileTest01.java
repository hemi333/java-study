import java.io.File;

/*
< URL과 URI >
- 웹에서의 경로를 포현할 때 사용
- URL(Uniform Resource Locator): 통합 자원 지시자, 자원이 있는 위치
--> https://xxx.tistory.com/category
- URI(Uniform Resource Identifier): 통합 자원 식별자, 자원까지 포함한 위치
--> https://xxx.tistory.com/category/12
 */
public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("C:/hm240522/temp/jdk.exe");

		// 파일명
		String fileName = file.getName();
		int pos = fileName.lastIndexOf("."); // 3

		System.out.println("경로를 제외한 파일명(확장자 포함): " + fileName);
		System.out.println("경로를 제외한 파일명(확장자 미포함): " + fileName.substring(0, pos));
		System.out.println("파일의 종류(확장자): " + fileName.substring(pos + 1));

		System.out.println("경로를 포함한 파일명: " + file.getPath());
		System.out.println("파일이 있는 위치(디렉터리, 폴더): " + file.getParent());
	}
}

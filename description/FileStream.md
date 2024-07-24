## < 파일의 종류 >

1. 바이트(바이너리) 파일: 실행 파일 형태의 모든 파일, ex) exe, jpg, avi, hwp, ppt, pdf ...
2. 문자 파일: txt(메모장)

### FileInputStream, FileOutputStream

- FileInputStream: 바이트 단위로 입력을 하는 클래스
- FileOutputStream: 바이트 단위로 출력을 하는 클래스

### FileReader, FileWriter

- FileReader: 문자 단위로 입력을 하는 클래스
- FileWriter: 문자 단위로 출력을 하는 클래스

### 보조 파일 입출력 스트림

- BufferedInputStream - FileInputStream의 속도를 향상시키는 보조 스트림
- BufferedOutputStream - FileOutputStream의 속도를 향상시키는 보조 스트림

Buffer(버퍼)

### 파일 스트림

- 바이트(바이너리)스트림 : 모든 파일...
- 문자 스트림 : 문자만으로 구성된 파일(txt, ...)

### File

- 파일 자체를 다루는 클래스
- 파일에 대한 여러가지 유용한 작업을 할 수 있음
- ex) 폴더 복사, 삭제, 이동, 파일 복사, 삭제, 이동, 정보 확인

### URL과 URI

- 웹에서의 경로를 포현할 때 사용
- URL(Uniform Resource Locator): 통합 자원 지시자, 자원이 있는 위치
  --> https://xxx.tistory.com/category
- URI(Uniform Resource Identifier): 통합 자원 식별자, 자원까지 포함한 위치
  --> https://xxx.tistory.com/category/12

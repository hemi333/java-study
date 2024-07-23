## < 에러와 예외 >

- Object를 상속한 Throwable 클래스를 상속하고 있음
- 에러(Error): JVM 자체에서 발생하는 심각한 오류, 개발자가 해결할 수 없는 오류
- 예외(Exception): 상황에 따라 개발자가 해결할 수 있는 오류, ex) 연산 오류, 숫자 포맷 오류, 널 포인터 오류 ...

### 예외의 종류

- 일반 예외: 컴파일 하기 전에 체크되는 예외
  --> ex) ClassNotFoundException, InterruptedException, IOException, FileNotFoundException, CloneNotSupportedException
- 실행 예외: 실행할 때 체크되는 예외
  --> RuntimeException
  --> ex) ArithmeticException, ClassCastException, ArrayIndexOutOfBoudsException, NumberFormatException, NullPointException

### RuntimeException

- 프로그램을 실행할 때 발생하는 예외

### try - catch - finally

- try : 예외가 발생할 수 있는 코드
- catch : 예외가 발생했을 때 처리 코드
- finally : 예외의 발생 유무와 상관 없이 항상 실행되는 코드

1. try ~ catch : 필수 블럭
2. finally : 선택 블럭
3. 나머지 처리

- 예외가 발생하지 않을 때: try -> finally -> 나머지 처리
- 예외가 발생했을 때: try -> catch -> finally -> 나머지 처리

### 여러 가지 예외가 발생할 때 처리 방법

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

### 예외 발생 처리 순서

- catch 블럭이 여러 개 있어도 하나의 catch 블럭을 처리하면 나머지는 들어가지 않음

  1. 예외가 발생하지 않았을 때: try -> finally -> 마지막 처리
  2. NumberFormatException 예외가 발생했을 때: try -> catch(NumberFormatException) -> finally -> 마지막 처리
  3. ArrayIndexOutOfBoundsException 예외가 발생했을 때: try -> catch(ArrayIndexOutOfBoundsException) -> finally -> 마지막 처리
  4. 기타 예외가 발생했을 때: try -> catch(Exception) -> finally -> 마지막 처리

### try ~ catch문의 사용 방법

- 1번, 2번: 단일 try ~ catch문
- 3번, 4번: 다중 try ~ catch문

  1. try ~ catch
  2. try ~ catch ~ finally
  3. try ~ catch ~ catch ...
  4. try ~ catch ~ catch ... finally

### 예외를 처리하는 방법

1. 예외를 직접 처리하는 방법

- try ~ catch 블록을 사용

2. 예외를 전가하는 방법

- 예외를 던지는 방법
- throw 키워드를 사용하는 방법
- 메서드를 호출한 곳으로 예외 처리를 전가하는 (던지는) 방법

### 예외를 처리하는 방법의 차이

1. 예외를 직접 처리하는 방법

- 장점: 예외를 직접 처리하기 때문에 견고한 프로그램을 만들 수 있음.
- 단점: 예외처리 코드가 많아지고, 코드가 복잡해짐. 해당 메서드에서 예외가 발생했단느 사실을 파악하기 어려움.

2. 예외를 전가하는 방법

- 장점: 여러 메서드에서 발생하는 예외를 한번에 모아서 처리할 수 있고, 코드가 간결해짐. 메서드명에 예외 전가가 있어 예외가 발생한 메서드라는 것을 파악하기가 용이함.
- 단점: 예외를 직접 처리하지 않고, 전가하므로 발생하는 여러 가지 문제가 발생할 수 있음.

  -> 예외를 전가하더라도 어딘가에서는 직접 예외를 처리하는 것이 좋음.

### 예외 되던지기

- 예외를 처리한 메서드에서 호출한 메서드로 예외를 다시 던져주는 방법
- 호출한 메서드에서도 예외를 알고, 처리할 필요가 있는 경우에 사용함.
- 확실한 예외의 처리를 하고자 하는 경우에 사용함.

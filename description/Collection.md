## [ 컬렉션 (Collection) ]

- 다양한 알고리즘을 사용하여 데이터를 효율적으로 처리하도록 만들어 놓은 것

### < 컬렉션의 종류 > ArrayList를 제일 많이 씀

- 인터페이스로 정의되어 있고, 구현한 구현체 클래스를 사용

1. List 계열 - Vector, ArrayList, LinkedList...
   - 순서(인덱스)가 있음, 중복 데이터를 허용
   - 가변적인 배열
2. Set 계열 - HashSet, TreeSet, LinkedHashSet...
   - 순서(인덱스)가 없음, 중복 데이터를 허용하지 않음
3. Map 계열 - HashMap, TreeMap, LinkedHashMap...
   - 키(key)와 값(value)의 쌍을 하나의 데이터로 갖게 됨.
   - 키는 순서가 없고, 중복 키를 허용하지 않음

ex) Stack, Queue ...

### < ArrayList 클래스 >

1. Vector 클래스의 기능, 사용법이 거의 동일
2. Vector의 쓰레드 동기화 기능이 성능의 저하를 일으키는 요인이 됨.
   -> ArrayList에서는 Vector의 쓰레드 동기화 기능을 제거하여 성능을 향상 시킴.
   -> 실제로 Vector보다 ArrayList를 많이 사용함.
3. Vector의 capacity(), element가 붙은 메서드는 없음.

### < ArrayList와 LinkedList의 추가/삭제 시간 비교 >

1. ArrayList : 순차적인 추가/삭제가 빠름, 비순차적인(중간) 추가/삭제가 느림, 접근속도가 빠름.
2. LinkedList : 순차적인 추가/삭제가 느림, 비순차적인(중간) 추가/삭제가 빠름, 접근속도가 느림.

### [목적과 용도에 따라 선택]

ArrayList : 순차적인 데이터 다룰때 유용 / 검색이 빠름

LinkedList : 데이터 중간 삽입에 유용 / 그거 빼고 다 단점 , 주소값 추가로 인한 메모리 낭비, 검색이 느림

CRUD 되는 시스템

- Create : 데이터 추가(insert의 개념)
- Read : 데이터 조회(검색)
- Update : 데이터 수정
- Delete : 데이터 삭제

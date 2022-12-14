## Json이란?

제이슨은 일종의 '양식'이라고 생각하면 편하다.
회사에서 공통된 양식으로 문서를 작성하듯이 코드를 짤 때도 json으로 일정한 틀을 맞춰주는 것이다.
json을 이용하면 특히 여러 사람과 공동작업을 할 때 유리하다.

- Json은 Key와 Value로 구성되어있다.

  - Key : 이름, 나이
  - Value : 홍길동, 30

- Key는 데이터베이스에 PK처럼 중복 될 수 없다.
- Value는 중복사용 가능하다.
- json value에 오는 데이터 타입

  - int
  - double
  - string
  - boolean
  - array
  - json \* json도 데이터 타입!

- 데이터 제공 = api server을 통해서 서로 데이터를 주고 받을 수 있다.

  이때 필요한게 바로 json이다. 같은 형식으로 데이터를 주고 받아야하기 때문!

## 주소 읽는 법

url 주소에서는 '?', '=', '&'만 기억하면 된다.

- ? : 쿼리스트링
  쿼리스트링은 프로그래밍에서 파라미터와 같은 역할을 한다.
- = : 대입연산자
- & : ,(콤마)

예)
https://entertain.naver.com/read?oid=076&aid=0003931625 에서

- 파라미터 값 총 갯수 : 2개
- 파라미터 값 : oid, aid
- 데이터 : 076, 0003931625

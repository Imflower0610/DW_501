## 💛 open : 새 윈도우 생성 💛
 : window 객체 메서드 중 하나인 open 알아보기!

### 1) open 사용형식 : window.open("url", "window_name", "property");

### 2) url : 페이지 주소

### 3)  window_name : 새 windw의 open위치 부여. 

        window_name은 "_blank"가 기본값이다. window_name은 따로 화면에 표시되진 않고, 다만 이름에 따라 window가 열리는 위치가 달라진다.
        1. _blank(새창에 열린다)
        2. _parent(부모 프레임에 열린다)
        3. _self(현재 페이지를 대체한다)
        4. _top(로드된 프레임셋 대체)

예) 현재 창에서 새창 띄우기
<img src="window_name.png" width = "700">

### 4) property : 새 window의 옵션 부여

                    1. height : 새 창의 높이 지정
                    2. width : 새 창의 너비 지정 
                    3. left : 모니터 화면 왼쪽에서부터 위치
                    4. top : 모니터 화면 위쪽에서부터 위치
                + (yes, no) 옵션 : 크롬은 적용안됨!
                    5. channelmode : 전체화면 (yes, no) 
                    6. fullscreen : 전체화면 (yes, no)
                    7. location : 주소표시줄 표시여부 (yes, no)
                    8. menubar : 메뉴바 표시여부 (yes, no) 
                    9. scrollbars : 스크롤바 표시여부 (yes, no)
                    10. status : 상태바 표시여부 (yes, no)
                    11. resizable : windw 크기 변경 가능 여부 (yes, no)
                    12. toolbar : 툴바 표시여부 (yes, no)
 예) 가운데 정렬하는 법
<img src ="property.png">



### 5) 부모, 자식 window 간 정보 전달하는법!
    * 부모 -> 자식 으로 정보를 전달하거나 
      자식 -> 부모로 정보를 전달하는 모든 경우 '자식 window' 쪽에서 작업해야 한다.
예) 부모, 자식 간 정보 전달
* 부모 window
<img src="parent.png">

* 자식 window
<img src="child.png">

 
## 💜 오늘 수업내용 정리 💜
### 1. window 객체 : 최상위 객체 

### 2. location 객체 (주소)

### 3. document 객체 (출력 화면)

### 4. history 객체 (방문 내역)

### 5. screen 객체 (브라우저와 브라우저가 표시되는 모니터 화면 전체)



### 1. window 객체 : 최상위 객체 
    -> 브라우저를 열었을 때 생성되는 항상 존재하는 객체
    * 속성 : classes , defaultStatus, document, frame, history, length, location, navigator
        1) classes : html문서에서 정의된 모든 스타일 시트
        2) defaultStatus : 상태바에 표시될 문자열 지정
        3) frame : window에 포함된 프레임 수 반환
            -> 여러 프레임이 존재할 경우 배열형태로 표시 가능(window.frames[0])
        4) history : Window가 방문한 URL정보
        5) innerHeight : 현재 브라우저의 document 영역의 높이
        6) innerWidth : 현재 브라주저의 document 영역의 너비
        7) location : 현재 문서의 URL정보
        8) menubar : 메뉴바 표시 여부 지정
        9) opener : open 함수로 생성한 윈도우 이름
        10) name : Window 이름
        11) outerHeight : 윈도우 밖 테두리 높이
        12) outerWidth : 윈도우 밖 테두리 너비
        13) pageXOffset : Window에 표시되는 X위치
        14) pageYOffset : Window에 표시되는 Y위치
        15) scrollbars : 스크롤바 표시 여부     
                        
    * window 객체 메서드() 
        1) alert() : 메시지와 OK버튼을 가진 메시지 박스
        2) setiInterval : 지정된 시간만큼 반복
        3) setTimeout : 지정된 시간 이후에 실행
        4) clearInterval : setInterval 해제
        5) clearTimeout : setTimeout 해제
        6) close() : window 닫기
        7) confirm : 질문 다이얼로그 확인과 취소 버튼을 가진 박스
        8) back, forward : 뒤로 이동, 앞으로 이동
        9) moveBy(X,Y) : 윈도우 이동(상대적) -> 이동거리
        10) moveTo(X,Y) : 윈도우 이동(절대적) -> 좌표
        11) resizeBy(X,Y) : 윈도우 크기 조정(상대적) -> 설정값 만큼의 크기가 줄거나 늘어남
        12) resizeTo(X,Y) : 윈도우 크기 조정(절대적) -> 설정값 만큼의 크기로 바뀜
        13) open : 새 윈도우 생성
            -> open(url, window_name, property);
            -> url :페이지 주소
            -> window_name  :
                    1. _blank(새창에 열린다)
                    2. _parent(부모 프레임에 열린다)
                    3. _self(현재 페이지를 대체한다)
                    4. _top(로드된 프레임셋 대체)
            -> property : 새 window의 옵션 부여
                        - height 새 창의 높이 지정
                        - width 새 창의 너비 지정 
                        - left 모니터 화면 왼쪽에서부터 위치
                        - top 모니터 화면 위쪽에서부터 위치               
                    
                 
                
 ## * history 객체
    : 사용자의 웹사이트 사용 내역
    1. history.length : 히스토리 목록에 포함된 url의 수
    2. histyry.back() : 뒤로 이동
    3. history.forward() : 앞으로 이동
    4. history.go(2) : 현재 url 위치에서 2만큼 앞으로 이동. 음수라면 뒤로, 양수라면 앞으로 이동

## * location 객체
    : 현재 윈도우의 url 주소에 대한 정보 제공 객체
    1. location.host : 호스트 이름과 포트번호(url로부터 분리하여 제공)
                    (ex) www.naver.com:80 <- 80은 생략해도 자동으로 들어감>
    2. location.hostname : url주소에 대한 호스트 이름
    3. location.href : 하이퍼링크 주소 지정
    4. location.pathname : 디렉토릴 위치(호스트)
    5. location.port : 호스트 포트번호
    6. location.protocol : 프로토콜 종류
    
    7. location.reload() : 문서 다시 읽기 
    8. window.location.assign(url주소) : url로 이동(방문기록 저장)
    9. window.location.replace(url) : url로 이동(방문기록 덮어씀)

## * navigator 객체
    : 웹 브라우저의 특성 정보를 가지는 객체
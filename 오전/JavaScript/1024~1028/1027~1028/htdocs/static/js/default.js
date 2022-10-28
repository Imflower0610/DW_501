$(document).ready(function () {
  $(".menu-toggle").on("click", function () {
    $(".gnb").stop().slideToggle("fast");
  });
});

// show() : 감춰져있던게 보임
// hide() : 감추는거
// toggle() : 감추는거 보여주는 거 다 가능! 감춰져있을 땐 show, 반대면 hide 기능함
// fadein() : 화면에서 보여지는 것
// fadeout() : 화면에서 감춰지는 것
// slideup() : 슬라이드방식으로 화면에 보여짐
// slidedown() : 슬라이드방식으로 화면에 가려짐
// slideToggle() : 슬라이드방식으로 화면에 보여지고 가려지는거 둘다 가능

// * () 안에는(밀리세컨드 시간)이 들어감 -생략시 즉시 열림
// * show,hide = display 자체가 생기고 사라지는 것(영역이 잡히지 않음)
// * fadein,fadeput = 고정되어 있는 영역이 보여지고 안보여지는 것

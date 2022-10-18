

// 객체명 tb
function tb(row, col, wd, hg) {
    this.row = row;
    this.col = col;
    this.width = wd;
    this.height = hg;
}

var tb_list = new Array();
var bt_cnt = 0;
var bt_check = false; //버튼 만들어졌는지 확인용 => 버튼이 있으면 true가 되게 설정

window.onload = function () {
    var add_bt = document.querySelector("#add");
    add_bt.addEventListener("click", add_button);

    var T_put = document.getElementsByClassName("T_put");
    for (var i in T_put) {
        T_put[i].addEventListener("keyup", function () {
            if (!bt_check) {//'!'를 붙이면 반대 -> bt_checkd가 false의 반대인 true일 때
                alert("새 세팅버튼을 추가하세요!")
                this.value = '';
            }
        })
    }
}
// event = keydown(키보드), focus(마우스), click(클릭)

function add_button() {
    if (bt_check) {// 새버튼 생성 후 값등록 안되었으면 새버틴 생성금지
        alert("값 먼저 등록해주세요");
        return;
    }

    var bt = document.createElement("button");
    bt.appendChild(document.createTextNode("세팅" + (++bt_cnt)));
    bt.setAttribute('data-value', '0')

    bt.addEventListener("click", function () {
        if (this.dataset.value == 0) // input 값 저장하기 전
            value_save(this);
        else // input 값 저장 이후
            table_draw(this);
    });

    document.getElementsByClassName("add_wrap")[0].appendChild(bt);
    bt_check = true;
}

function table_draw(obj) {
    var draw = document.querySelector("#draw");
    var data = tb_list[parseInt(obj.dataset.value) - 1]
    var table= "";

    table = '<table border="1">';
    for (var i = 0; i < data.col; i++) { // 행
        table += '<tr>';
        for (var j = 0; j < data.row; j++) { // 열
            table += '<td width =' + data.width + ' height =' + data.height + '> </td>';
        }
        table += '</tr>';
    }
    table += '</table>';
    draw.innerHTML= table;
}

function value_save(obj) {
    var input_label = ["행", "열", "너비", "높이"];
    var T_put = document.getElementsByClassName("T_put");
    for (var i in T_put) {
        if (T_put[i].value == '') {
            alert(input_label[i] + "을 입력하세요");
            T_put[i].focus();
            return;
        }
    }
// 행,열,너비,높이 입력하고 세팅 버튼 클릭시 tb객체에 값 저장
// 저장 후 tb객체를 배열에 저장
    var temp = new tb(T_put[0].value, T_put[1].value, T_put[2].value, T_put[3].value);
    tb_list.push(temp);

    obj.dataset.value = bt_cnt;
    bt_check = false;
    for (var i = 0; i < T_put.length; i++) {
        T_put[i].value = '';
    }
}


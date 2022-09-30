//boom.js

var board = new Array(400);
board.fill(0);

for(var i=0; i<20; ){
    let pos = Math.floor(Math.random()*400);
    if(board[pos] != 1){
        board[pos] = 1;
        i++
    }
}
window.onload = function(){
    var table = "<table>";
    for(var i=0; i<20; i++){
        table += "<tr>";
        for(var k= 0; k<20; k++){
            table +="<td class='bm' data-idx="+(i*20+k)+"></td>";
            // * 바깥쪽에 있는 따옴표랑 안에 있는 따옴표는 다르게 해야한다.
        }
        table += "</tr>";
    }
    document.getElementById("wrap").innerHTML = table;

    var bm = document.getElementsByClassName("bm");

    // alert(bm.length);
    // bm[0].sytle.background='red';

    for(var i in bm){
        bm[i].addEventListener('click', function(){
             //1. 이 i는 event 추가할 때 사용, 이벤트 사용하기 전에 만들어진 변수이기 때문에  
            let n = this.dataset.idx;
             if(board[n]==1){//2. 여기서 i사용이 안됨
                this.style.background=
                'url(../../../image/boom2.png) no-repeat center center';
                this.style.backgroundSize = 'cover';
                // this.innerHTML="<img src='../../image/Boom.png'>";
            }
            else this.style.background = "rgb(230,230,230)";
        });
    }
}

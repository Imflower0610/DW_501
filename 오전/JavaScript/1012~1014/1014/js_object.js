
function movie(title, dir, year, genre){ //생성자 함수
    this.movie_title = title;
    this.movie_dir = dir;
    this.movie_year = year;
    this.movie_genre = genre; 
}

movie.prototype.out = function(){
    return this.movie_title+""+this.movie_dir+""+this.movie_year+""+this.movie_genre;
}

var movie_list= new Array(); //movie객체 저장될 배열

function enroll(){
    var val_temp = document.getElementsByClassName("movie");

    var data = new movie(val_temp[0].value, val_temp[1].value, val_temp[2].value, val_temp[3].value)
    movie_list.push(data);
    print();
}

function print(){
    var li = document.createElement("li");
    li.innerText=movie_list[movie_list.length-1].out();
}

window.onload = function () {
    var input = document.getElementsByClassName("movie");
    for (var i in input) {
        input[i].addEventListener("focus", function () {
            this.classList.add("active");
        });
        input[i].addEventListener("blur", function () {
            this.classList.remove("active");
        });
    }
}

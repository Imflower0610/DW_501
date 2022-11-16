package movie;

public class movieVo {
	
	private String movieTitle;
	private int movieYear;
	private int movieLimit;
	
	//source=> generate constructor using field(지역변수 초기화 생성자)
	public movieVo(String movieTitle, int movieYear, int movieLimit){
		this.movieTitle=movieTitle;
		this.movieYear=movieYear;
		this.movieLimit=movieLimit;
	}
	public void output() {
		System.out.println("영화제목 : "+ movieTitle + ", 개봉년도 : "+movieYear+", 관람등급 : "+ movieLimit +"세 관람가");
	
	}
	@Override
	public String toString() {//toStirng 메서드는 자바에서 일반적인 출력용 메서드
		return "영화제목 : "+ movieTitle + ", 개봉년도 : "+movieYear+", 관람등급 : "+ movieLimit +"세 관람가";
	}
	//source=>generate getter/setter
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public int getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}
	public int getMovieLimit() {
		return movieLimit;
	}
	public void setMovieLimit(int movieLimit) {
		this.movieLimit = movieLimit;
	}
	
}
/*
 * 영화제목, 개봉년도, 관람등금
 * 
 *  생성자 메서드를 통해 데이터 저장 가능하게 만들기
 *  출력 메서드(제목, 년도, 등급, 출력되어야함)
 *  
 *
 */
 
package 자바0929;

public class Emp {
// 필드변수	
private int 사원번호;
private String 사원이름;
private int 급여;
private int 보너스;

// getter setter 메소드 생성
public int get사원번호() {
	return 사원번호;
}
public void set사원번호(int 사원번호) {
	this.사원번호 = 사원번호;
}
public String get사원이름() {
	return 사원이름;
}
public void set사원이름(String 사원이름) {
	this.사원이름 = 사원이름;
}
public int get급여() {
	return 급여;
}
public void set급여(int 급여) {
	this.급여 = 급여;
}
public int get보너스() {
	return 보너스;
}
public void set보너스(int 보너스) {
	this.보너스 = 보너스;
}

// 생성자 생성
Emp(){} // 파라미터 값 없는 생성자
Emp(int 사원번호,String 사원이름, int 급여, int 보너스){ // 파라미터 값 있는 생성자
this.급여 = 급여;
this.보너스 = 보너스;
this.사원이름 = 사원이름;
this.사원번호 = 사원번호;
}
}

package 자바1115;

//클래스란 유사한 특징을 묶어 놓은 집합체
//클래스는 필드변수와 메소드로 구성
//클래스는 객체를 생성하기 위한 틀

//클래스는 객체지향언어에만 있음

public class Emp {
 String ename;//사원이름
 int sal;//급여
 String job;//직급
 
 //필드변수를 초기화할 생성자 만들기
public Emp(String ename, int sal, String job) {
	this.ename = ename;
	this.sal = sal;
	this.job = job;
}
}

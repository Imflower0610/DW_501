package 자바1115;

//java.util 패키지 안에 들어있는 ArrayList라는 클래스를 사용하려면 import 해야함
import java.util.ArrayList;
import java.util.List;

class Student{
	//필드변수
	String name;
	int height;
	//문제1. 필드변수에 값을 초기화할 수 있는 생성자 만들기
	public Student(String name, int height) {
		this.name= name;
		this.height=height;
	}

}
public class 오늘수업1115 {

	public static void main(String[] args) {
	//문제2. 학생 클래스 3개 만들어서 아래 값 출력하기
		//이름 : 홍길동, 키 179
		//이름 : 김길동, 키 185
		//이름 : 이길동, 키 172
		Student s1= new Student("홍길동", 179);
		Student s2= new Student("김길동", 185);
		Student s3= new Student("이길동", 172);
		
	//문제3. 학생클래스 ArrayList에 add하기
		List<Student> 학생클래스 = new ArrayList<>();
		학생클래스.add(s1);
		학생클래스.add(s2);
		학생클래스.add(s3);
		//일반 for문으로 출력
		for(int i=0; i<학생클래스.size(); i++) {
			System.out.println("이름 : "+ 학생클래스.get(i).name +", 키 : "+학생클래스.get(i).height);
		}
		//for each문으로 출력
		for( Student student : 학생클래스) {
			System.out.println("이름 : "+ student.name + ", 키 : "+student.height);
		}
	}

}

package 자바1115;

import java.util.ArrayList;
import java.util.List;

public class Home {

	public static void main(String[] args) {
		Emp sawon1 = new Emp("SMITH",160,"CLERK");
		Emp sawon2 = new Emp("ALLEN",1600,"SALESMAN");
		Emp sawon3 = new Emp("WARD",1250,"SALESMAN");
		Emp sawon4 = new Emp("JONES",2975,"MANAGER");
		Emp sawon5 = new Emp("MARTIN",1250,"SALESMAN");
		Emp sawon6 = new Emp("BLAKE",2850,"MANAGER");
		Emp sawon7 = new Emp("CLARK",2450,"MANAGER");
		Emp sawon8 = new Emp("SCOTT",3000,"ANALYST");
		Emp sawon9 = new Emp("KING",5000,"PRESIDENT");
		Emp sawon10 = new Emp("TURNER",1500,"SALESMAN");

		//문제1. arrayList을 생성 후 sawon1 ~ sawon10 add하기!
		List<Emp> sawon = new ArrayList<>();
		sawon.add(sawon1);
		sawon.add(sawon2);
		sawon.add(sawon3);
		sawon.add(sawon4);
		sawon.add(sawon5);
		sawon.add(sawon6);
		sawon.add(sawon7);
		sawon.add(sawon8);
		sawon.add(sawon9);
		sawon.add(sawon10);
		
		//문제2. 직원 총 급여 구하기
		int total=0;
		int cnt=0;
		int max =0;
		String name = null;
		String respon= null;
		for( Emp sa : sawon) {
			total += sa.sal;
		
		//문제4. 직업이 MANAGER고 급여가 2500이상받는 사원 수 구하기
			if(sa.job.equals("MANAGER")&&sa.sal>=2500) {
				cnt++;
			}
		
		//문제5. 가장 급여를 많이 받는 사원의 이름과 직업 조회하기
			if(sa.sal>max) {
				max=sa.sal;
				name= sa.ename;
				respon=sa.job;
			}
			
		}
		//문제3. 직원 평균 급여 구하기
		int avg = total/sawon.size();
		System.out.println("직원 총급여 : " + total);
		System.out.println("직원 평균급여 : " + avg);		
		System.out.println("직업이 매니저, 급여가 2500 이상인 사원 수 : " + cnt);
		System.out.println("가장 급여를 많이 받는 직원 : " + name + ", 직업 :"+ respon);
	}

}

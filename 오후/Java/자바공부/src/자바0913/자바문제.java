package 자바0913;

public class 자바문제 {

	public static void main(String[] args) {
/*
 * 문제1) 배열 name에 있는 원소(element) 중 "Kim"의 위치를 찾아
 * "Kim은 x에 있습니다." 출혁나오게 로직 구현하기
 * 정답) Kim은 배열 1번째에 있으므로 Kim은 1번에 있습니다가 정답
 * hint) equals, for문사용 
 */
		
		String name[] = {"Brian", "Kim"};
		
//	내가 푼거
		for(int i=0; i<name.length; i++){
			if(name[i].equals("Kim")) {
			System.out.println("Kim은 "+i+"번째에 있습니다");
			}
			}

//	정답
	//	방법1
		for(int i=0; i<name.length; i++){
			boolean isCheck = name[i].equals("Kim");
			System.out.println(isCheck);
			if(isCheck) {//isCheck 자체가 참이라는 뜻이므로 true안써도 됨
				System.out.println("Kim은 " +i+ "번에 있습니다.");
				break;
			}
		}
	//	방법2
		for(int i=0; i<name.length; i++){
			if(name[i].equals("Kim")) {
			System.out.println("Kim은 "+i+"번째에 있습니다");
			}
			}
		
/* 문제2)
 * 홍길동 번호는 010-3333-9999입니다. 길동이는 개인정보 유출을 생각해
 * 핸드폰 번호를 010-****-****로 보이게 하고 싶습니다.
 * spilt과 for문을 이용해서 이를 출력하시오
 */
//	내가 푼거
		String 핸드폰번호= "010-3333-9999";
		String 배열[]=핸드폰번호.split("-");
		String 정답="0";
		for(int i=0; i<배열.length; i++){
			if(i==0) 
				정답="010";
			else 
				정답+="-****";
		}System.out.println(정답);
		
//정답
		String phone= "010-3333-9999";
		String array[]=phone.split("-");
		
		for(int i=1; i<array.length; i++) {
			array[i] ="****";
		}
		String 결과 = array[0]+"-"+array[1]+"-"+array[2];
		System.out.println(결과);
		
	}

}

package 자바1114;

import java.util.ArrayList;
import java.util.List;

public class 제네릭과컬렉션즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컬렉션즈 : 자료구조(스텍. 힙. 맵. 셋...)
		/*
		//배열
		int[] array = {5,7,6,10}; // 배열 사용하는 방법 1
		int[] array2 = new int[4]; // 배열 사용하는 방법 2
		
		// List
		// <> : 제네릭
		// List : 컬렉션즈
		List<Integer> list = null;
		list.add(10);
		list.add(20);
		
		//list 호출하는 방법
		System.out.println("0번째 값 : " + list.get(0));
		System.out.println("1번째 값 : " + list.get(1));		
	
		//List 길이 출력
		System.out.println(list.size());
		list.remove(1);//1번째 요소 삭제
		System.out.println(list.size());
		
		List<Integer> numberlist = new ArrayList<Integer>();
		numberlist.add(5);
		numberlist.add(7);
		numberlist.add(13);
		numberlist.add(15);
		//첫번째 방법
		for(int i =0; i<numberlist.size(); i++) {
			if(numberlist.get(i)%5==0) 
				System.out.println(numberlist.get(i)); 
		}
		System.out.println();
		//두번째 방법
		for(int i :numberlist) {
			if(i%5==0) {
				System.out.println("for each : "+i);
			}
		}*/
		// 제네릭 안에는 클래스만 사용가능! 그래서 int는 올 수 없고, integer만 가능!
		List<Integer>numberlist = new ArrayList<Integer>();
		numberlist.add(50);
		numberlist.add(100);
		numberlist.add(300);
		numberlist.add(99);
		//문제 안에 있는 요소 총합 수하고, 100이상인 요소가 몇개인지 출력
		int sum =0;
		int count =0;
		for (int i: numberlist) {
			sum+=i;
			if(i>=100) {count++;}	
		}
		System.out.println("총합은 "+sum +", 100이상인 요소 갯수는 "+count);
		
		//문자를 담은 List
		List<String> wordList = new ArrayList<String>();
		wordList.add("아이스아메리카노");
		wordList.add("카페라떼");
		wordList.add("카페모카");
		wordList.add("아이스아메리카노");
		wordList.add("아이스아메리카노");
		wordList.add("아이스아메리카노");
		int cnt=0;
		for(String item : wordList) {
			System.out.println(item);
		//자바에서 문자비교는 equals!
			if(item.equals("아이스아메리카노")){
				++cnt;
				}
		}
		
		버거킹 골드와퍼 = new 버거킹();
		골드와퍼.버거종류= "치즈버거종류";
		골드와퍼.버거가격 = 9000;
		
		버거킹 주니어와퍼 = new 버거킹();
		주니어와퍼.버거종류 ="베이직와퍼종류";
		주니어와퍼.버거가격 = 4000;
		
		List<버거킹> 버거킹선화점 = new ArrayList<버거킹>();
		버거킹선화점.add(골드와퍼);
		버거킹선화점.add(주니어와퍼);
		
	//버거킹 선화점에 있는 모든 메뉴를 출력
	for(버거킹 선화점 : 버거킹선화점) {
		System.out.println(선화점.버거종류);}
	}
}

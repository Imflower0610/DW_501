package movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class theater {
	public static void main(String[] args) {
		List<movieVo> list = new ArrayList<>();
		
		String path="c:/test/movie.txt";
		try {
			BufferedReader file = new BufferedReader(new FileReader(path));
		//try 내부에 오류 있으면 catch 실행/ 오류없으면 catch 실행 안됨(일종의 예외처리라고 할 수 있음) 
			String line2 = file.readLine();//readLine() :  한줄 가져오기 = 첫줄 가져오기
			String line3 = file.readLine();// 첫줄 다음줄 가져오기 = 두번째줄
			// => 반복문 실행이 더 유리
			
			while(true) {
				String line = file.readLine();
				if(line==null)break;
				String[] temp = line.split(" ");//배열로 넣기
				movieVo data = new movieVo(temp[0],Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
				list.add(data);
			}
		}catch(Exception e){// Exception : 예외처리 최상위 포지션
			System.out.println("파일 없다");
			//file.close();
		}
		
		for(movieVo data : list) 
			System.out.println(data.toString());
		
		
		
		
		
	/*
		new movieVo();// new를 이용해서 movieVo 공간을 만들어줌
	*/	
	/*
	 *  내가 푼거	
		movieVo m1 = new movieVo("도그",2022,12);
		movieVo m2 = new movieVo("인생은 아름다워",2022,15);
		movieVo m3 = new movieVo("공조2",2022,15);
		movieVo m4 = new movieVo("스마일",2022,15);
		
		List<movieVo> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);

		for(movieVo m:list) {
			m.output();
		}
	*/
	/* 쌤이 푼거
	 * movieVo arr = new movieVo[4];
	   arr[0] = new movieVo("한산", 2022,15);
	   arr[1] = new movieVo("한산", 2022,15);
       arr[2] = new movieVo("한산", 2022,15);
	   arr[3] = new movieVo("한산", 2022,15);
	   
	   for(movieVo data:list) {
			data.output();
		}
	   
	 */
		
	}

}

// 영화입력은 총 네개 입력
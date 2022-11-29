package cafe.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cafe.VO.food;
import cafe.VO.order_list;

public class food_DAO extends base_DAO{
	// 주문내역
	public List<order_list> order_select(String id){
		List<order_list> list = new ArrayList<>();
		// 주문내역이 여러개 존재할 수 있기에 배열형태로 저장하기 위해 ArrayList
		String sql = " select * from order_list where an_order=?";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			rs = pt.executeQuery();
			while(rs.next()) {
				order_list data = new order_list(
				rs.getInt("order_seq"), rs.getString("food_name"), rs.getString("an_order"),
				rs.getInt("order_price"), rs.getInt("delivery_complete"), rs.getString("memo")
				);
				//DB에서 사져온 데이터들을 orderlist객체로 하나씩 생성해주고arraylist에 저장하기
				list.add(data);
			}//반복문 종료되면eb에서 가져온 모든 데이털ㄹ 저장해주었다는 것
			return list;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public Map<Integer, food> food_list() {

		Map<Integer,food> food_map = new HashMap<>();
		
		String sql="select * from food";
		
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery();
			while(rs.next()) {//여러 레코드를 조회했다면 반복문 처리
				food data = new food(rs.getInt("food_seq"),rs.getString("food_name"),
						rs.getInt("cost"),rs.getInt("cook_time"),rs.getInt("cal"), 
						rs.getString("allergy"),rs.getInt("order_quantity"));
			food_map.put(data.getFood_seq(), data);
			} return food_map;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}return null;
	}
//String name, String an_order, int price,String memo
	public boolean order_insert(order_list cont) {
		//매개변수를 order_list로 한 이유는 food_service에서 주문 내용들을 order_list의 객체에 저장하였기에
		// DB에 저장하려면 order_list 객체의 값을 가져와서 저장해야한다.
		// DB저장하기
		// 1. SQL문 작성하기
		// 2. 자바에서 DB에 전달하기 위한 Statement나 preparedstatement에 sql문 넣어주기
		// 3. DB에 저상
	String sql = "insert into order_list (food_name,an_order,order_price,memo) values (?,?,?,?)";
	try {
				pt = conn.prepareStatement(sql);
				pt.setString(1, cont.getFood_name());
				pt.setString(2, cont.getAn_order());
				pt.setInt(3, cont.getPrice());
				pt.setString(4, cont.getMemo());
				pt.executeUpdate();//sql문 실행
				return true;
			}catch(SQLException e){
				e.printStackTrace();
				return false;
			}
		
	}

}
/*
 
 	자바 커렉션
 	Collection (인터페이스)
   		1. List(인페이스)
   			: 배열구조
   			주데이터를 저장할 때 사용
   			1) ArrayList (클래스) 
   				: 배열구조 -> 인덱스 사용 가능 -> 순서대로 저장
   					-> 저장하고 저장된 정보를 빼올 때 속도 빠름
   					-> 데이터를 가져올 때 대부분의 경우 ArrayList 사용됨
   					단, 추가적으로 정보를 삽입하고 삭제할 때는 속도가 느리다.
   					
   			2) LinkedList (클래스)
   				: ArrayList의 단점을 보완해서 만든 것 
   				-> ArrayList처럼 순서대로 저장되는 것이 아니라 각 공간이 있고 메모리 주소로 연결시킨 것
   				-> 추가적인 정보를 삽입, 삭제할 때도 연결만 새로하면 되니까 속도가 빨라짐
   				-> 두번째로 많이 사용한다.
   				
   			3) vector
   				: ArrayList와 동일한 구조.
   				 배열의 크기가 늘어나고, 줄어듬에 따라서 자동으로 크기가 조절됨
  
   			4) stack (= 계산기구조)
   				: 정보가 stack(쌓인다)고 생각하면 됨 
   				정보가 쌓였으니까 가장 먼저 받은 정보가 가장 아래에 쌓이는 것
   				* stack 구조
   					- FILO : First In Last Out
   				    - LIFO : Last In First Out
   			
   			5) queue
   				: 그냥 들어온 순서대로 순차적으로 내보내는 방식
   				ex) 컴퓨터의 명령 처리 방식, 프린터의 처리방식 등
   				* 우선순위 queue
   					: 우선순위를 설정하면 먼저 동작한다.
   					ex) 백신 프로그램 - 다른 프로그램보다 우선적으로 동작
   				* queue 구조
   					- FIFO : First In First Out
   				  	- LILO : Last In Last Out
   	
   		2. Set (인터페이스)
   			: 집합구조
   			- 배열과 달리 집합의 값들은 순서가 존재하지 않고 중복도 없다.
   			- 집합은 대상 원소가 집합에 소속되었는지 여부를 검사한다.
   			- 주데이터는 list구조로 들여오고 set구조는 일부데이터를 사용할 때만 사용
   			 	(set구조로 전체 주데이터 가져올 때 메모리 문제 발생할 수 있기 때문)
   			1) HashSet
   				: HashSet은 가장 대표적인 set
   				  내가 입력한 값과 Hash 함수를 통해 얻은 값은 1:1로 저장된다.
   				-> 데이터를 중복 저장할 수 없고 순서대로 입력되지 않는다.
   				* HashSet은 null요소도 허용한다.
   				
   			2) TreeSet
   				: TreeSet도 중복된 데이터를 저장할 수 없고 입력한 순서대로 값을 저장하지 않는다. 
   				다만 TreeSet은 기본적으로 오름차순으로 데이터를 정렬.
   				데이터 보다 작으면 왼쪽, 크면 오른쪽에 정렬
   				
   				* 이진트리
   				: 각각의 노드가 최대 두 개의 자식 노드를 가지는 트리 자료 구조
   				- node : 데이터가 들어가는 공간 
   				- root : 최상위 node
   				
   				* 이진트리 출력 순서
   					- 전위 : 가운데 -> 왼쪽 -> 오른쪽  순서로 출력 
   					- 중위 : 왼쪽 -> 가운데 -> 오른쪽 순서로 출력
   					- 후위 : 왼쪽 -> 오른쪽 -> 가운데 순서로 출력
   				
   			3) LinkedHashSet
   				: LinkedHashSet도 중복된 데이터를 저장할 수 없다. 
   				다만, 입력된 순서대로 데이터를 관리한다. 
   				
   	Map (인터페이스)
   	 : Map은 키와 값으로 구성된 Entry객체를 저장하는 구조를 가지고 있는 자료구조이다.
   	 -> key와 value의 구조로 하나의 데이터를 저장한다.
   	 	-> 데이터 접근 구조 : Key를 찾아 데이터를 리턴한다.
   	  		= Key는 중복으로 사용하지 않는 데이터로 지정해야 한다.
   	  		-> 데이터의 key가 있기때문에 데이터 불러올 때 반복문 필요없음
   	 		-> 반복문 필요없기 때문에 list구조보다 훨씬 간단하게 사용할 수 있음
   	
   	 * Map 인터페이스의 메서드
   	 	- V put(K key, V value) : k, v는 제네릭 타입이고, <키, 값>으로 저장된다.
   	 	- boolean containsKey(Object k) 맵에 키가 있다면 true 없다면 false
   	 	- boolean containsValue(Object v) 맵에 value가 있다면 true 없다면 false
   	 	- V get (Object K) : Key에 매칭되는 값을 리턴
   	 	
   	 	예시)
   	 	Map<String, member> = new HashMap<String, member>();
   	 	m.put("10가1234", new member("김유신"));
   	 		V put( k key, V value)
   	 		K String, V - member
   	 		
   	 	m.containsKey("20사1234");
   	 		boolean containsKey(Object K)
   	 		Object -String
   	 	
   	 	
   		1. HashMap 
   			: 해시맵은 이름 그대로 해싱(Hashing)된 맵(Map)이기 때문에 많은 양의 데이터를 검색할 때 효율적이다.
   			-> 키를 해싱하여 자료를 저장하고 꺼내오기 때문에 속도가 빠르니까!	
   			* 스프링에서 자주 사용
   			-> HashMap 사용시 input name값이 키, value값이 value로 자동저장되기 때문
   			* null값을 허용
   			
   		2. HashTable
   			: HashMap과 사용법이 거의 동일한 컬렉션(Collection)
   			HashTable은 자바에서 해시 테이블을 구현한 클래스 중 가장 오래됨
   			HashMap과는 다르게 null값을 허용하지 않는다.
   			
   		3. TreeMap
   			: TreeMap에서는 Tree라는 개념이 중요! TreeSet에서 처럼 이진트리 구조를 사용
   			마찬가지로 객체를 저장하면 자동으로 오름차순 정렬이 된다.
   			
   		4. Properties
   			: Properties 클래스는 HashTables의 하위 클래스이다.
			HashTables를 상속 받았기 때문에 Map의 속성 즉, Key와 Value를 갖는다.
			HashMap과 큰 차이가 없지만, Properties 클래스는 파일 입출력을 지원한다
   		
   
 */


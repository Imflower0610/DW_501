package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class member_DAO {
	// java로 데이터베이스 저장하는 방법
	// 어떤 데이터베이스를 사용하는가 먼저 정해야됨(우리는 My SQL)
	
	private Connection conn = null;// 데이터베이스 연결정보를 저장
	private Statement st = null;// sql 질의문을 데이터베이스에 전달
	private PreparedStatement pt = null;//sql 질의문을 데이터베이스에 전달
	private ResultSet rs = null;//sql질의문 조회 결과를 저장
	
	public member_DAO(){//기본생성자 메서드
		DriverLoad();
		connect();
		table_check();
	}
	public boolean member_insert(String id, String name, String tel, String email) {
		String sql = "insert into member (id,name,tel,email) values (?,?,?,?)";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, name);
			pt.setString(3, tel);
			pt.setString(4, email);
			pt.executeUpdate();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		
	}
	private void tablemake() {
		String sql="create table member(member_seq int auto_increment primary key , "
				+ "id varchar(50) not null, name varchar(20) not null, "
				+ "tel varchar(20) not null, email varchar(255) not null)";
		try {
			st = conn.createStatement();
			int result = st.executeUpdate(sql);
			System.out.println("member 테이블 생성");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	private void table_check() {
		String sql = "select COUNT(*) as cnt from information_schema.tables ";
		sql += "where table_schema='dw_501' and table_name='member'";
		
		try {
			st = conn.createStatement();// 접속정보로 질의문 저장할 수 있는 객체 생성
			rs = st.executeQuery(sql);// 만들어 놓은 질의문을 저장해서 연결된 데이터베이스에 전달하고 결과받기
			if(rs.next()) {//rs.next() : rs에 결과값이 있는가? 없는가? 확인하고 rs에서 값 가져오기해야한다.
				int cnt = rs.getInt("cnt");
				if(cnt==0)
					tablemake();
			}
			rs.close();
			st.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void connect() {
		// DB주소 : dbc:mysql://데이터베이스서버주소:mysql-port/DB명
		String url="jdbc:mysql://localhost:3306/dw_501";
		String user ="root";//mysql 아이디
		String pass = "Wkwmdsk18!";//mysql 비밀번호
		try {
			conn = DriverManager.getConnection(url,user,pass);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("접속 실패");
		}
	}
	
	private void DriverLoad() {

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");//문자열을 클래스화 해준다.
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		}
		//Class.forName("cafe.control.order");

		// 드라이버 로드라는 작업은 해당 데이터베이스와 연결해주는 클래스르르 컴퓨터 메모리에 로드(적재, 올리다.) 해주는 작업이다.
	}
	
}
/*
	자바 - 데이터베이스 연결
	1. 연결할 데이터베이스의 드라이버 로드 
   	   : 많이 사용되는 데이터베이스의 드라이버는 해당 데이터베이스 웹사이트에서 얻을 수 있다.
	2. 드라이버 로드를 하면 데이터 베이스와 자바 프로그램 간의 연결이 이루어진다.
	3. 데이터베이스와 연결을 하였다면 데이터베이스에 로그인을 시도한다.
	4. 데이터베이스 계정을 가지고 로그인을 해야한다
	5. 데이터베이스의 주소와 계정명, 비밀번호가 필요하다.
*/
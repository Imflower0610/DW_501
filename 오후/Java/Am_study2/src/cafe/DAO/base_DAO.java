package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//java로 데이터베이스 저장하는 방법
	// 어떤 데이터베이스를 사용하는가 먼저 정해야됨(우리는 My SQL)
	
public class base_DAO {
	protected Connection conn=null;// 데이터베이스 연결정보를 저장
	protected Statement st=null;// sql 질의문을 데이터베이스에 전달
	protected PreparedStatement pt=null;//sql 질의문을 데이터베이스에 전달
	protected ResultSet rs=null;//sql질의문 조회 결과를 저장

	public base_DAO() {
		DriverLoad();
			Connect();
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
	private void Connect() {
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
}

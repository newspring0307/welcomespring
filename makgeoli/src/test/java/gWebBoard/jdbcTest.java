package gWebBoard;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class jdbcTest {
	//스태틱 붙으면 다른 영역에 단 한번 실행함
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	}
	@Test
	public void testconn() {
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.65:1521:xe","king","k123");
			System.out.println("연결성공");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
}

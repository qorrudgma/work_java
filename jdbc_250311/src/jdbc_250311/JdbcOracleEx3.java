package jdbc_250311;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleEx3 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			// 오라클 드라이버 로드(오라클 설치 파일에서 가져옴)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB연결완료");
			stmt = conn.createStatement();
//			내용 삽입 (자동커밋)
//			stmt.executeUpdate("INSERT INTO STUDENT3 VALUES('0893012','아무개','컴퓨터공학')");
//			내용 변경 (자동커밋)
//			stmt.executeUpdate("UPDATE STUDENT3 SET ID='0189011' WHERE NAME='아무개'");
//			내용 삭제 (자동커밋)
			stmt.executeUpdate("DELETE FROM STUDENT3 WHERE NAME='아무개'");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
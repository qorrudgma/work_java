package jdbc_250311;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcOracleEx1 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB연결완료");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib 여기에있음
//ojdbc6.jar 이거 찾아가야함
//프로젝트에서 우클릭 -> build path -> configure build path -> libraries -> modulepath -> add external 여기서 찾은 파일 연결
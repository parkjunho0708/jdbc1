package kr.co.itcen.jdbc;

public class ConnectionTest {
	
	public static void main(String[] args) {
		try {
			// 1. JDBC Driver 로딩
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Fail to Loading Driver : " + e);
		}
	}
	
}

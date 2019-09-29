import java.sql.Connection;
import java.sql.DriverManager;

 class posgretest{
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "test");
			conn.close();
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("NG");
		}
	}
}
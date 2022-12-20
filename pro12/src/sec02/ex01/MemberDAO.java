package sec02.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

	private Statement stmt;
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	/*
	 * private static final String driver = "oracle.jdbc.driver.OracleDriver";
	 * private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	 * private static final String user = "EXAMPLE"; private static final String pwd
	 * = "java";
	 */

	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List listMembers(MemberVO membervo) {
		List Memberlist = new ArrayList();
		try {
			// connDB();
			con = dataFactory.getConnection();
			String query = "select * from t_member";
			if((_name!=null && _name.length()!=0)) {
				query+=" where name=?";
				pstmt = con.PreparedStatement(query);
				pstmt.setString(1, _name);
			}
			else {
				pstmt = con.prepareStatement(query);
			}
			
			System.out.println("prepareStatement: "+query)
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				membersList.add(vo);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return memberlist;
			
			
	}

}

/*
 * private void connDB() { try { Class.forName(driver);
 * System.out.println("Oracle ����̹� �ε� ����"); con =
 * DriverManager.getConnection(url, user, pwd);
 * 
 * System.out.println("Connection ���� ����"); stmt = con.createStatement();
 * System.out.println("Statement ���� ����"); } catch (Exception e) {
 * e.printStackTrace(); }
 */
}

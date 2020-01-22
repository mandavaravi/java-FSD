import java.util.*;
import java.sql.*;
public class jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement st = con.createStatement();
			//int count = st.executeUpdate("delete from RAVITESTDB.emp where empno=7521");
			//System.out.println(count + " rows deleted");
			//int count1 = st.executeUpdate("insert into RAVITESTDB.dept values(50, 'Development', 'Hyderabad')");
			//System.out.println(count1 + " rows inserted");
			//int count2 = st.executeUpdate("update RAVITESTDB.dept set loc ='Sydney' where deptno=10 ");
			//System.out.println(count2 + " rows updated");
			
			/*ResultSet rs = st.executeQuery("select * from RAVITESTDB.dept");
			while(rs.next()) {
				System.out.println("dept No: " + rs.getInt(1) + " Dpt name: " + rs.getString(2) + "\tLoc: " + rs.getString(3));
			}
			*/
			Scanner sc = new Scanner(System.in);
			
			int dno =sc.nextInt();
			String dna = sc.next();
			String loca = sc.next();
			
			PreparedStatement ps = con.prepareStatement("insert into RAVITESTDB.dept values(?,?,?)");
			ps.setInt(1, dno);
			ps.setString(2, dna);
			ps.setString(3, loca);
			int count = ps.executeUpdate();
			System.out.println(count + " inserted using prepared stament. ");
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

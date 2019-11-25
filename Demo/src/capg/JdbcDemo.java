package capg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args) {
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracledb","12345");
				PreparedStatement ps=con.prepareStatement("insert into student values(1,'ece','jbit','123455')");
				
				int j= ps.executeUpdate();
				if(j==1) {
					System.out.println("insertede");
					
				}
				else
				{
					System.out.println("failed");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}

}

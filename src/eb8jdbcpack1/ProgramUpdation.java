package eb8jdbcpack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgramUpdation {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/abc";
	String userId="root";
	String passWord="root";
	String quary="UPDATE EMPLOYEE SET NAME = 'NAVEEN BATTACAHARI' WHERE id=3";
	
	
	Class.forName(driver);
	
	Connection connection=DriverManager.getConnection(url, userId, passWord);
	
	Statement statement=connection.createStatement();
	
	statement.execute(quary);
	
	connection.close();
	
	System.out.println("UPDATE done");
}
}

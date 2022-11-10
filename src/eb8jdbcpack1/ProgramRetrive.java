package eb8jdbcpack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProgramRetrive {
public static void main(String[] args) throws Exception {
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/abc";
	String userId="root";
	String passWord="root";
	String quary="SELECT * FROM EMPLOYEE";
	
	
	Class.forName(driver);
	
	Connection connection=DriverManager.getConnection(url, userId, passWord);
	
	Statement statement=connection.createStatement();
	
	ResultSet resultSet=statement.executeQuery(quary);
	
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getLong(3));
		System.out.println("------------------------");
	}
	
	System.out.println("DATA RETRIVED SUCCESSFULLY");
	
	connection.close();
	
}
}

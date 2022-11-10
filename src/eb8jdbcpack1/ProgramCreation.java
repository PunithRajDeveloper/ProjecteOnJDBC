package eb8jdbcpack1;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class ProgramCreation {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter id : ");
	int id=ip.nextInt();
	 
	System.out.println("enter name : ");
	String name=ip.next();
	
	System.out.println("enter mobail number : ");
	long salary=ip.nextLong();
	
	//loading driver and registering the driver
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//establishing the connection between java and database
	
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
	
	//Create statement
	
	Statement statement=connection.createStatement();
	
	//Execute a statement
	
	statement.execute("INSERT INTO EMPLOYEE VALUE(?,?,?)");
	
	//Close the connection
	
	connection.close();
	
	System.out.println("data inserted successfully");
	
}
}

package eb8jdbcpack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class ProgramUserInput {
public static void main(String[] args) throws Exception {
	
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter id : ");
	int id=ip.nextInt();
	 
	System.out.println("enter name : ");
	String name=ip.next();
	
	System.out.println("enter mobail number : ");
	long phonNum=ip.nextLong();
	
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/abc";
	String userId="root";
	String passWord="root";
	
	
	
	Class.forName(driver);
	
	Connection connection=DriverManager.getConnection(url, userId, passWord);
	
	PreparedStatement preparedStatement =connection.prepareStatement("Insert into EMPLOYEE values(?,?,?)");
	preparedStatement.setInt(1, id);
	preparedStatement.setString(2, name);
	preparedStatement.setDouble(3, phonNum);
    
	boolean b=preparedStatement.execute();
	
	System.out.println(b);
	
	connection.close();
	
	System.out.println("done");
}
}

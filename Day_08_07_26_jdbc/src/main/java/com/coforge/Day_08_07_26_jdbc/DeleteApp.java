package com.coforge.Day_08_07_26_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteApp {
/*   
 * 
 * 
 * */
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/empdb";
		String uname="root";
		String pwd="";
		Connection con = DriverManager.getConnection(url, uname, pwd);
		
		String query="delete from employeesalary where emp_name=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		
		ps.setString(1, "Ajay");
		
		int noOfRows=ps.executeUpdate();
		System.out.println(noOfRows+" rows got deleted");

	}

}

package com.coforge.Day_08_07_26_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World!");
        //1.Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		String url="jdbc:mysql://localhost:3306/empdb";
		String uname="root";
		String pwd="";
		//2.Establish connection
		Connection con = DriverManager.getConnection(url, uname, pwd);
		System.out.println("connection established ");
		
		//3.create or use statement
		//Statement ---- select 
		String query="select * from employeesalary";
		Statement statement= con.createStatement();		
		
		//PreparedStatement ---- DML queries
		//CallableStatment ---- procedure
		
		//4.execute query
		ResultSet rs = statement.executeQuery(query);
		
		while(rs.next()) 
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "
					+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getDate(5));
			
		
		// executeQuery --- select (result is set of records), 
		//executeUpdate --- dml(an int is returned) ,
		//execute --- boolean value 
		

    }
}

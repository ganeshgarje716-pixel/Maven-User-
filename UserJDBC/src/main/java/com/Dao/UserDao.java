package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbcConnection.JDBCUtil;

public class UserDao {
	
	
	 static Connection con = JDBCUtil.createConnection();
	
	
	public static  void createTable() {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("create table user (name varchar(34), password varchar(34), email varchar(34), gender varchar(34), dob date, mobileNo float, address varchar(34), age int)");
			
			pst.execute();
			
			System.out.println("Create Table");
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	

}

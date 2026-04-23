package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Entity.User;
import com.jdbcConnection.JDBCUtil;

public class UserDao {
	
	
	 static Connection con = JDBCUtil.createConnection();
	
	
//	public static  void createTable() {
//		
//		try {
//			
//			PreparedStatement pst = con.prepareStatement("create table user (name varchar(34), password varchar(34), email varchar(34), gender varchar(34), dob date, mobileNo float, address varchar(34), age int)");
//			
//			pst.execute();
//			
//			System.out.println("Create Table");
//		} 
//		catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//	}
	 
	 
	 
	 
	 public String insertUser (User user) {
		 
		 try {
			 
			PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");
			
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getGender());
			pst.setString(5, user.getDob());
			pst.setFloat(6, user.getMobileNo());
			pst.setString(7, user.getAddress());
			pst.setInt(8, user.getAge());
			
			pst.executeUpdate();
		 } 
		 catch (SQLException e) {
			
			e.printStackTrace();
		 }
		 
		 return "User Insert Successfully";
	 }
	 
	 
	 
	 public String updateUser(User user) {
		 
		  try {
			  
			PreparedStatement pst = con.prepareStatement("update user set name=?, password=?, gender=?, dob=?, mobileNo=?, address=?, age=? where email=?");
			
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getGender());
			pst.setString(4, user.getDob());
			pst.setFloat(5, user.getMobileNo());
			pst.setString(6, user.getAddress());
			pst.setInt(7, user.getAge());
			pst.setString(8, user.getEmail());
			
			pst.executeUpdate();
		  } 
		  catch (SQLException e) {
			
			e.printStackTrace();
		  }
		 
		  return "User Update Successfully";
	 }
	 
	 
	 public String deleteUser(String string) {
		 
		 try {
			 
			PreparedStatement pst = con.prepareStatement("delete from user where email=?");
			
			pst.setString(1, string);
			
			pst.executeUpdate();
		 }
		 catch (SQLException e) {
			
			e.printStackTrace();
		 }
		 
		 return "User Delete Successfully";
	 }
	
	

}

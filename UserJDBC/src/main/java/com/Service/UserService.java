package com.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import com.Dao.UserDao;
import com.Entity.User;
import com.Exception.SomthingWentWrongException;
import com.Exception.UserIsNullException;
import com.Exception.UserNotFoundException;
import com.Exception.UsersNotFoundException;

public class UserService {
	
	
	UserDao dao=new UserDao();
	
	
	public String insert(User user) {
		
		
		if (user == null) {
			
			throw new UserIsNullException("User is Null");
		}
		 String msg = dao.insertUser(user);
		 
		 return msg;
	}
	
	
	public String update(User user) {
		
		String msg = dao.updateUser(user);
		
		if (msg == null) {
			
			throw new SomthingWentWrongException("Cheak your SQL Query Again");
		}
		 
		 return msg;
	}
	
	
	public String delete(String string) throws SQLException {
		
		 String msg = dao.deleteUser(string);
		 
		 if (msg == null) {
			 
			throw new SQLException("Id Not Found");
		}
		 
		 return msg;
	}
	
	
	public User get(String string) {
		
		 User user = dao.getUser(string);
		 
		 if (user == null) {
			 
			throw new UserNotFoundException("User Not Found With Email = "+string);
		}
		 
		 return user;
	}
	
	
	public ArrayList<User> getAll() {
		
		 ArrayList<User> User = dao.getAllUser();
		 
		 if (User.isEmpty()) {
			 
			throw new UsersNotFoundException("No User Present in DB");
		}
		 
		 return User;
	}
	
	
	
	
	
	

}

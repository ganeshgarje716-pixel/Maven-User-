package com.Service;

import com.Dao.UserDao;
import com.Entity.User;

public class UserService {
	
	
	UserDao dao=new UserDao();
	
	
	public String insert(User user) {
		
		return dao.insertUser(user);
	}
	
	
	public String update(User user) {
		
		return dao.updateUser(user);
	}
	
	
	public String delete(String string) {
		
		return dao.deleteUser(string);
	}
	
	
	public User get(String string) {
		
		return dao.getUser(string);
	}
	
	
	
	
	
	

}

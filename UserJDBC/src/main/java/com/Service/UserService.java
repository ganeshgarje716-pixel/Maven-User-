package com.Service;

import com.Dao.UserDao;
import com.Entity.User;

public class UserService {
	
	
	UserDao dao=new UserDao();
	
	
	public String insert(User user) {
		
		return dao.insertUser(user);
	}
	
	
	
	
	
	

}

package com.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import com.Entity.User;
import com.Service.UserService;

public class UserController {
	
	
	UserService service=new UserService();
	
	
	
	public String  insert(User user) {
		
		return service.insert(user);
	}
	
	
	public String update(User user) {
		
		return service.update(user);
	}
	
	
	public String delete(String string) throws SQLException {
		
		return service.delete(string);
	}
	
	
	public User get(String string) {
		
		return service.get(string);
	}
	
	
	public ArrayList<User> getAll() {
		
		return service.getAll();
	}

}

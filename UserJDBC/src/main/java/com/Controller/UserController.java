package com.Controller;

import com.Entity.User;
import com.Service.UserService;

public class UserController {
	
	
	UserService service=new UserService();
	
	
	
	public String  insert(User user) {
		
		return service.insert(user);
	}

}

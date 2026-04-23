package com.Main;

import java.util.Scanner;

import com.Controller.UserController;
import com.Dao.UserDao;
import com.Entity.User;

public class UserMain {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		UserController controller=new UserController();
		
		
		while (true) {
			
			
			System.out.println("1.Insert User");
			System.out.println("2.Update User By Id");
			System.out.println("3.Delete User By Id");
			System.out.println("4.Get User By Email");
			System.out.println("5.Get All User");
			System.out.println("6.Exit");
			
			System.out.println("Enter Your Choise = ");
			int no=sc.nextInt();
			
			
			if (no == 1) {
				
				System.out.println("Enter User Name = ");
				String username=sc.next();
				
				System.out.println("Enter Password =");
				String password=sc.next();
				
				System.out.println("Enter Email =");
				String email=sc.next();
				
				System.out.println("Enter Gender =");
				String gender=sc.next();
				
				System.out.println("Enter DOB =");
				String dob=sc.next();
				
				System.out.println("Enter Mobile No =");
				float mobileNo=sc.nextFloat();
				
				System.out.println("Enter Address =");
				String address=sc.next();
				
				System.out.println("Enter Age =");
				int age=sc.nextInt();
				
				
				try {
					
					User u=new User(username, password, email, gender, dob, mobileNo, address, age);
					
					System.out.println(controller.insert(u)); 
				} 
				catch (Exception e) {
					
					e.printStackTrace();
				}
				
			break;	
			}
			
			
			if (no == 2) {
				
				
				System.out.println("Enter User Name = ");
				String username=sc.next();
				
				System.out.println("Enter Password =");
				String password=sc.next();
				
				System.out.println("Enter Email =");
				String email=sc.next();
				
				System.out.println("Enter Gender =");
				String gender=sc.next();
				
				System.out.println("Enter DOB =");
				String dob=sc.next();
				
				System.out.println("Enter Mobile No =");
				float mobileNo=sc.nextFloat();
				
				System.out.println("Enter Address =");
				String address=sc.next();
				
				System.out.println("Enter Age =");
				int age=sc.nextInt();
				
				
				try {
					
					User u=new User(username, password, email, gender, dob, mobileNo, address, age);
					
				    System.out.println(controller.update(u));
				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
				
			break;	
			}
			
			
			if (no == 3) {
				
				
				System.out.println("Enter Email =");
				String email=sc.next();
				
				
				try {
					
					System.out.println(controller.delete(email));
				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
			   
			break;	
			}
			
			
			
			
			
		}
		
		
	}

}

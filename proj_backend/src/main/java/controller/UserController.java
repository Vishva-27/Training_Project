package controller;

import java.sql.Date;

import dao.UserDAO;
import dao.impl.UserDAOImpl;
import model.User;

public class UserController {

	public static void main(String[] args) {
        UserDAO dao = new  UserDAOImpl();
		
		User user = new User(106, "Kartik",8712345678L,"abcd@gmail.com", "E-411 Preet Vihar Delhi", Date.valueOf("2021-03-02"),"abcd","img2.jpeg");
		
		dao.saveUser(user);
		System.out.println("Inserted Successfully");

	}

}

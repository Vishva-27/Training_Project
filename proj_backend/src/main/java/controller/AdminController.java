package controller;

import dao.AdminDAO;
import dao.impl.AdminDAOImpl;
import model.Admin;

public class AdminController {

	public static void main(String[] args) {
		
		AdminDAO adao= new AdminDAOImpl();
		
		Admin admin= new Admin(6,"Karthik","kart@gmail.com","pass");
		
		adao.saveAdmin(admin);
		System.out.println("Inserted Successfully");
	}

}

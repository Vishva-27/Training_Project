package controller;

import dao.ContactDAO;
import dao.impl.ContactDAOImpl;
import model.Contact;

public class ContactController {

	public static void main(String[] args) {
		
		ContactDAO ctdao = new ContactDAOImpl();
		
		Contact contact = new Contact(106,"Karthik","kart@gmail.com","1239","Message");
		
		ctdao.saveContact(contact);
		System.out.println("Inserted Successfully");
	}

}

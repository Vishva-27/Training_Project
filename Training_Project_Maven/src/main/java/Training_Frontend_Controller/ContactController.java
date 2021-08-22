package Training_Frontend_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactDAO;
import dao.UserDAO;
import dao.impl.ContactDAOImpl;
import dao.impl.UserDAOImpl;
import model.Contact;
import model.Course;
import model.User;

@WebServlet("/contact")
public class ContactController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("c_id"));
		String name = request.getParameter("c_name");
		String email = request.getParameter("c_email");
		String phone = request.getParameter("c_phone");
		String message= request.getParameter("c_msg");
		
		
		
		
		ContactDAO cdao = new ContactDAOImpl();
		
		Contact contact = new Contact(id,name,email,phone,message);
		
		boolean status = cdao.saveContact(contact);
		
		if(status) {
			out.println("Record saved successfully");
		}else {
			out.println("Try Again!");
		}
	}
}

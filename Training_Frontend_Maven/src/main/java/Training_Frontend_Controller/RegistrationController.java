package Training_Frontend_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import dao.impl.UserDAOImpl;
import model.User;

@WebServlet("/register")
public class RegistrationController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		long phone = Long.parseLong(request.getParameter("phone"));
		String email = request.getParameter("email");
		String address= request.getParameter("addr");
		String rdate= request.getParameter("date");
		String password= request.getParameter("pass");
		String photo = request.getParameter("photo");
		
		//out.println("ID : "+id+" Name : "+name+" Phone : "+phone+" Email : "+email+" Address : "+address+" Date: "+rdate+" Password : "+password+"Photo : "+photo);
		
		UserDAO dao = new  UserDAOImpl();
		
		User user = new User(id, name,phone,email, address, Date.valueOf(rdate),password,photo);
		
		boolean status = dao.saveUser(user);
		
		if(status) {
			out.println("Record saved successfully");
		}else {
			out.println("Try Again!");
		}
	}
}

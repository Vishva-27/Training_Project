package Training_Frontend_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactDAO;
import dao.CourseDAO;
import dao.impl.ContactDAOImpl;
import dao.impl.CourseDAOImpl;
import model.Contact;
import model.Course;

@WebServlet("/course")
public class CourseController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("cou_id"));
		String name = request.getParameter("cou_name");
		String desp = request.getParameter("cou_desp");
		String resource = request.getParameter("cou_resource");
		String fees= request.getParameter("cou_fees");
		
		
		
		
		CourseDAO cdao = new CourseDAOImpl();
		
		Course course = new Course(id,name,desp,fees,resource);
		
		boolean status = cdao.saveCourse(course);
		
		if(status) {
			out.println("Record saved successfully");
		}else {
			out.println("Try Again!");
		}
	}
}

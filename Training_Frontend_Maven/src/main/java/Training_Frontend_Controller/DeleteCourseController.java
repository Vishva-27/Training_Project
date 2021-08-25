package Training_Frontend_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import dao.CourseDAO;
import dao.impl.CourseDAOImpl;
import dao.impl.DataSourceUtil;
import model.Course;

@WebServlet("/delete")
public class DeleteCourseController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("co_id");
		
		
		
		
		CourseDAO cdao = new CourseDAOImpl();
		
		Course course = new Course(id);
		
		boolean status = cdao.deleteCourse(course);
		
		if(status) {
			out.println("Record deleted successfully");
		}else {
			out.println("Try Again!");
		}
		
		
		
}
}

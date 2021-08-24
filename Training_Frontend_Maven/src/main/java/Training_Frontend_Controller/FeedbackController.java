package Training_Frontend_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactDAO;
import dao.FeedbackDAO;
import dao.impl.ContactDAOImpl;
import dao.impl.FeedbackDAOImpl;
import model.Contact;
import model.Feedback;

@WebServlet("/feedback")
public class FeedbackController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("user_f_id"));
		String name = request.getParameter("f_name");
		String email = request.getParameter("f_email");
		String feedback= request.getParameter("f_feed");
		
		
		
		
		FeedbackDAO fdao = new FeedbackDAOImpl();
		
		Feedback feedbacko = new Feedback(id,name,email,feedback);
		
		boolean status = fdao.saveFeedback(feedbacko);
		
		if(status) {
			out.println("Record saved successfully");
		}else {
			out.println("Try Again!");
		}
	}
}

package Training_Frontend_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import db.DBUtil;

@WebServlet("/enroll")
public class EnrollCourseController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		DataSource datasource = DataSourceUtil.dataSource();
		Connection conn;
		try {
			conn = datasource.getConnection();
			String query = "insert into user_course(user_id,course_id) values(?,?)";
			try {
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setInt(1,(int) session.getAttribute("id"));
				ps.setInt(2,(int) session.getAttribute("ch_id"));
				ps.executeUpdate();
				out.println("You have successfully enrolled the course.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
}
}

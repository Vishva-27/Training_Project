package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.CourseDAO;
import db.DBUtil;
import model.Course;

public class CourseDAOImpl implements CourseDAO{
	
	Connection conn = DBUtil.getConnection();

	@Override
	public boolean saveCourse(Course course) {
		String query = "insert into course values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,course.getC_id());
			ps.setString(2, course.getC_name());
			ps.setString(3, course.getC_desp());
			ps.setString(4, course.getC_fees());
			ps.setString(5, course.getC_resource());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}

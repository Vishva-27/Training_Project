package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.UserDAO;
import db.DBUtil;
import model.User;

public class UserDAOImpl implements UserDAO{
	
	Connection conn = DBUtil.getConnection();

	@Override
	public boolean saveUser(User user) {
		String query = "insert into user1 values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getId());
			ps.setString(2, user.getName());
			ps.setLong(3, user.getPhone());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getAddress());
			ps.setDate(6, user.getReg_date());
			ps.setString(7, user.getPassword());
			ps.setString(8, user.getUpload_photo());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
}

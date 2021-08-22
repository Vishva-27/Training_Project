package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.AdminDAO;
import db.DBUtil;
import model.Admin;

public class AdminDAOImpl implements AdminDAO{
	
	Connection conn = DBUtil.getConnection();

	@Override
	public boolean saveAdmin(Admin admin) {
		String query = "insert into admin values(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, admin.getA_id());
			ps.setString(2, admin.getA_name());
			ps.setString(3, admin.getA_email());
			ps.setString(4, admin.getA_password());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}

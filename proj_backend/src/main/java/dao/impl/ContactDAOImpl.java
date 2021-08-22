package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.ContactDAO;
import db.DBUtil;
import model.Contact;

public class ContactDAOImpl implements ContactDAO{
	
	Connection conn = DBUtil.getConnection();

	@Override
	public boolean saveContact(Contact contact) {
		String query = "insert into contact values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, contact.getCon_user_id());
			ps.setString(2, contact.getCon_name());
			ps.setString(3, contact.getCon_email());
			ps.setString(4, contact.getCon_phone());
			ps.setString(5, contact.getCon_msg());
			ps.setInt(6, contact.getCon_id());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}

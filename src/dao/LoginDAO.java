package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import model.UserLogin;

public class LoginDAO {

	final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	final String JDBC_URL =
		"jdbc:mysql://localhost:3306/themutter?characterEncoding=UTF-8&serverTimezone=JST";
	final String DB_USER = "root";
	final String DB_PASS = "";

	public UserLogin findByUser(User u) {

		UserLogin ul = null;
		Connection conn = null;

		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "SELECT MAIL FROM USER WHERE ID = ? AND PASS = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, u.getId());
			ps.setString(2, u.getPass());

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String mail = rs.getString("MAIL");
				ul = new UserLogin(u.getId(), mail, u.getPass());
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
		return ul;
	}
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.UserLogin;

public class UserInfoChangeDAO {

	final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	final String JDBC_URL =
		"jdbc:mysql://localhost:3306/themutter?characterEncoding=UTF-8&serverTimezone=JST";
	final String DB_USER = "root";
	final String DB_PASS = "";

	public boolean update(UserLogin ul) {

		Connection conn = null;

		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "UPDATE USER SET MAIL = ?,PASS = ? WHERE ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, ul.getMail());
			ps.setString(2, ul.getPass());
			ps.setString(3, ul.getId());

			int result = ps.executeUpdate();
			if(result != 1) {
				return false;
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					return false;
				}
			}
		}
		return true;
	}
}

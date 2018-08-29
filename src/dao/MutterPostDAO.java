package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Mutter;
import model.UserLogin;

public class MutterPostDAO {

	final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	final String JDBC_URL =
		"jdbc:mysql://localhost:3306/themutter?characterEncoding=UTF-8&serverTimezone=JST";
	final String DB_USER = "root";
	final String DB_PASS = "";

	public List<Mutter> find() {

		List<Mutter> list = new ArrayList<Mutter>();
		Connection conn = null;

		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "SELECT ID,TEXT,TIME FROM MUTTER ORDER BY TIME";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String id = rs.getString("ID");
				String text = rs.getString("TEXT");
				String time = rs.getString("TIME");
				Mutter m = new Mutter(id, text, time);
				list.add(0, m);
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
		return list;
	}

	public boolean create(UserLogin ul, Mutter m) {

		Connection conn = null;

		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "INSERT INTO MUTTER (ID,TEXT,TIME) VALUES (?,?,CURRENT_TIME())";
			PreparedStatement ps = conn.prepareStatement(sql);

			m.setId(ul.getId());

			ps.setString(1, m.getId());
			ps.setString(2, m.getText());

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

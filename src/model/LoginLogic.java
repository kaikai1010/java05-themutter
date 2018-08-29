package model;

import dao.LoginDAO;

public class LoginLogic {
	public UserLogin execute(User u) {

		LoginDAO dao = new LoginDAO();
		UserLogin ul = dao.findByUser(u);
		return ul;

	}
}

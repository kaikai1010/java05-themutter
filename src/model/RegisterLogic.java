package model;

import dao.RegisterDAO;

public class RegisterLogic {
	public boolean execute(User u) {

		RegisterDAO dao = new RegisterDAO();
		boolean isRegister = dao.create(u);
		return isRegister;
	}
}

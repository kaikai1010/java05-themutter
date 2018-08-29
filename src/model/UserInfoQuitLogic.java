package model;

import dao.UserInfoQuitDAO;

public class UserInfoQuitLogic {
	public boolean execute(UserLogin ul) {

		UserInfoQuitDAO dao = new UserInfoQuitDAO();
		boolean isUserInfoQuit = dao.delete(ul);
		return isUserInfoQuit;
	}
}

package model;

import dao.UserInfoChangeDAO;

public class UserInfoChangeLogic {
	public boolean execute(UserLogin ul) {

		UserInfoChangeDAO dao = new UserInfoChangeDAO();
		boolean isUserInfoChange = dao.update(ul);
		return isUserInfoChange;

	}
}

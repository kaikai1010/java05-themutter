package model;

import dao.MutterPostDAO;

public class MutterPostAddLogic {
	public void execute(UserLogin ul, Mutter m) {

		MutterPostDAO dao = new MutterPostDAO();
		dao.create(ul, m);

	}
}

package test;

import dao.UserInfoChangeDAO;
import model.UserLogin;

public class UserInfoChangeDAOTest {
	public static void main(String[] args) {

		test();
	}

	private static void test() {
		UserLogin ul = new UserLogin("daisuke", "daisuke@com2", "5678");

		UserInfoChangeDAO dao = new UserInfoChangeDAO();
		boolean result = dao.update(ul);

		if(result) {
			System.out.println("success" + ul.getId() + ul.getMail() + ul.getPass());
		}
		else {
			System.out.println("failed" + ul);
		}
	}
}

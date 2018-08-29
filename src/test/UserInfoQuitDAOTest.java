package test;

import dao.UserInfoQuitDAO;
import model.UserLogin;

public class UserInfoQuitDAOTest {
	public static void main(String[] args) {

		test();
	}

	private static void test() {
		UserLogin ul = new UserLogin("daisuke", "daisuke@com", "1234");

		UserInfoQuitDAO dao = new UserInfoQuitDAO();
		boolean result = dao.delete(ul);

		if(result) {
			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}
	}
}

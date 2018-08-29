package test;

import dao.LoginDAO;
import model.User;
import model.UserLogin;

public class LoginDAOTest {
	public static void main(String[] args) {

		test();
	}

	private static void test() {
		User u = new User("daisuke", "1234");

		LoginDAO dao = new LoginDAO();
		UserLogin ul = dao.findByUser(u);

		if(ul != null) {
			System.out.println("success" + ul.getId() + ul.getMail() + ul.getPass());
		}
		else {
			System.out.println("failed");
		}
	}
}

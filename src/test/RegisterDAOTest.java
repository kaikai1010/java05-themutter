package test;

import dao.RegisterDAO;
import model.User;

public class RegisterDAOTest {
	public static void main(String[] args) {

		test();
	}

	private static void test() {
		User u = new User("daisuke", "daisuke@com", "1234");

		RegisterDAO dao = new RegisterDAO();
		boolean result = dao.create(u);

		if(result) {
			System.out.println("success" + u);
		}
		else {
			System.out.println("failed" + u);
		}
	}
}

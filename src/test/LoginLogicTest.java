package test;

import model.LoginLogic;
import model.User;
import model.UserLogin;

public class LoginLogicTest {
	public static void main(String[] args) {

		test();
	}

	private static void test() {
		User u = new User("daisuke", "1234");

		LoginLogic logic = new LoginLogic();
		UserLogin ul = logic.execute(u);

		if(ul != null) {
			System.out.println("success" + ul.getId() + ul.getMail() + ul.getPass());
		}
		else {
			System.out.println("failed" + ul);
		}
	}
}

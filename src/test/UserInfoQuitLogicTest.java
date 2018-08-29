package test;

import model.UserInfoQuitLogic;
import model.UserLogin;

public class UserInfoQuitLogicTest {
	public static void main(String[] args) {

		test();
	}

	private static void test() {
		UserLogin ul = new UserLogin("sheena", "daisuke@com", "1234");

		UserInfoQuitLogic logic = new UserInfoQuitLogic();
		boolean result = logic.execute(ul);

		if(result) {
			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}
	}
}

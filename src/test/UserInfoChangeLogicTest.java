package test;

import model.UserInfoChangeLogic;
import model.UserLogin;

public class UserInfoChangeLogicTest {
	public static void main(String[] args) {

		test();
	}

	private static void test() {
		UserLogin ul = new UserLogin("daisuke", "daisuke@com", "1234");

		UserInfoChangeLogic logic = new UserInfoChangeLogic();
		boolean isUserInfoChange = logic.execute(ul);

		if(isUserInfoChange) {
			System.out.println("success" + ul.getId() + ul.getMail() + ul.getPass());
		}
		else {
			System.out.println("failed" + ul);
		}
	}
}

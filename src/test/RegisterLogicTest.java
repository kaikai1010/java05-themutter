package test;

import model.RegisterLogic;
import model.User;

public class RegisterLogicTest {
	public static void main(String[] args) {

		test();
	}

	private static void test() {
		User u = new User("sheena", "sheena@com", "1234");

		RegisterLogic logic = new RegisterLogic();
		boolean result = logic.execute(u);

		if(result) {
			System.out.println("success" + u);
		}
		else {
			System.out.println("failed" + u);
		}
	}
}

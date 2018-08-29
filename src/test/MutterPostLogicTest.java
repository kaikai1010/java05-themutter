package test;

import java.util.List;

import dao.MutterPostDAO;
import model.Mutter;
import model.UserLogin;

public class MutterPostLogicTest {
	public static void main(String[] args) {

		testGetList();
		testAdd();
	}

	private static void testGetList() {

		MutterPostDAO dao = new MutterPostDAO();
		List<Mutter> list = dao.find();

		for(Mutter m : list) {
			System.out.println(m.getId() + m.getText() + m.getTime());
		}
	}

	private static void testAdd() {

		UserLogin ul = new UserLogin();
		ul.setId("kai");

		Mutter m = new Mutter();
		m.setText("happy^^");

		MutterPostDAO dao = new MutterPostDAO();
		dao.create(ul, m);

	}

}

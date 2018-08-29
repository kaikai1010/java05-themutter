package test;

import java.util.List;

import dao.MutterPostDAO;
import model.Mutter;
import model.UserLogin;

public class MutterPostDAOTest {
	public static void main(String[] args) {

		testFind();
		testCreate();
	}

	private static void testFind() {

		MutterPostDAO dao = new MutterPostDAO();
		List<Mutter> list = dao.find();

		for(Mutter m : list) {
			System.out.println(m.getId() + m.getText() + m.getTime());
		}
	}

	private static void testCreate() {

		UserLogin ul = new UserLogin();
		ul.setId("kai");

		Mutter m = new Mutter();
		m.setText("happy^^");

		MutterPostDAO dao = new MutterPostDAO();
		boolean isMutterPostAdd = dao.create(ul, m);

		System.out.println(isMutterPostAdd);

	}

}

package model;

import java.util.List;

import dao.MutterPostDAO;

public class MutterPostGetListLogic {
	public List<Mutter> execute() {

		MutterPostDAO dao = new MutterPostDAO();
		List<Mutter> list = dao.find();
		return list;

	}
}

package model;

import java.io.Serializable;

public class UserLogin implements Serializable {
	private String id;
	private String mail;
	private String pass;

	public UserLogin() {}
	public UserLogin(String id, String mail, String pass) {
		this.id = id;
		this.mail = mail;
		this.pass = pass;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getId() {
		return id;
	}
	public String getMail() {
		return mail;
	}
	public String getPass() {
		return pass;
	}
}

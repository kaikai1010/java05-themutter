package model;

import java.io.Serializable;

public class User implements Serializable {
	private String id;
	private String mail;
	private String pass;

	public User() {}
	public User(String id, String mail, String pass) {
		this.id = id;
		this.mail = mail;
		this.pass = pass;
	}
	public User(String id, String pass) {
		this.id = id;
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

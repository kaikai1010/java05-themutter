package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	private String id;
	private String text;
	private String time;

	public Mutter() {}
	public Mutter(String id, String text, String time) {
		super();
		this.id = id;
		this.text = text;
		this.time = time;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}
	public String getText() {
		return text;
	}
	public String getTime() {
		return time;
	}

}

package model;

public class Contact {

	private int con_user_id;
	private String con_name;
	private String con_email;
	private String con_phone;
	private String con_msg;
	private int con_id;
	
	public Contact() {
		
	}

	public Contact(int con_user_id, String con_name, String con_email, String con_phone, String con_msg) {
		super();
		this.con_user_id = con_user_id;
		this.con_name = con_name;
		this.con_email = con_email;
		this.con_phone = con_phone;
		this.con_msg = con_msg;
	}

	public int getCon_user_id() {
		return con_user_id;
	}

	public void setCon_user_id(int con_user_id) {
		this.con_user_id = con_user_id;
	}

	public String getCon_name() {
		return con_name;
	}

	public void setCon_name(String con_name) {
		this.con_name = con_name;
	}

	public String getCon_email() {
		return con_email;
	}

	public void setCon_email(String con_email) {
		this.con_email = con_email;
	}

	public String getCon_phone() {
		return con_phone;
	}

	public void setCon_phone(String con_phone) {
		this.con_phone = con_phone;
	}

	public String getCon_msg() {
		return con_msg;
	}

	public void setCon_msg(String con_msg) {
		this.con_msg = con_msg;
	}

	public int getCon_id() {
		return con_id;
	}

	public void setCon_id(int con_id) {
		this.con_id = con_id;
	}
	
	
}

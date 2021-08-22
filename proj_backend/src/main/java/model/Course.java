package model;

public class Course {

	private int c_id;
	private String c_name;
	private String c_desp;
	private String c_fees;
	private String c_resource;
	
	public Course(){
		
	}

	public Course(int c_id, String c_name, String c_desp, String c_fees, String c_resource) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_desp = c_desp;
		this.c_fees = c_fees;
		this.c_resource = c_resource;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_desp() {
		return c_desp;
	}

	public void setC_desp(String c_desp) {
		this.c_desp = c_desp;
	}

	public String getC_fees() {
		return c_fees;
	}

	public void setC_fees(String c_fees) {
		this.c_fees = c_fees;
	}

	public String getC_resource() {
		return c_resource;
	}

	public void setC_resource(String c_resource) {
		this.c_resource = c_resource;
	}
	
	
}


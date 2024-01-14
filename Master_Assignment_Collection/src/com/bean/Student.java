package com.bean;

 public class Student {
	private int sid;
	private String sname, email;
	private long phno;

	public Student(int sid, String sname, String email, long phno) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phno = phno;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "\nStudent [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phno=" + phno + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

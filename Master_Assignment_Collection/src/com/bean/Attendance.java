package com.bean;

public class Attendance {
	private int sno;
	private int sid;
	private String status;
	private MyDate attendancedate;

	public Attendance(int sno, int sid, String status, MyDate d) {
		super();
		this.sno = sno;
		this.sid = sid;
		this.status = status;
		this.attendancedate = d;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MyDate getD() {
		return attendancedate;
	}

	public void setD(MyDate d) {
		this.attendancedate = d;
	}

	@Override
	public String toString() {
		return "\nAttendance [sno=" + sno + ", sid=" + sid + ", status=" + status + ", Date=" + attendancedate
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

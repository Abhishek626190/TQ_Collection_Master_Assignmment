package com.bean;

//import java.util.ArrayList;

public class Course {
	private int cid, duration;
	private String cname;
	private MyDate startDate;
	private double fees;
	private String subject;

	public Course(int cid, int duration, String cname, MyDate startDate, double fees, String subject) {
		super();
		this.cid = cid;
		this.duration = duration;
		this.cname = cname;
		this.startDate = startDate;
		this.fees = fees;
		this.subject = subject;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public MyDate getStartDate() {
		return startDate;
	}

	public void setStartDate(MyDate startDate) {
		this.startDate = startDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", duration=" + duration + ", cname=" + cname + ", startDate=" + startDate
				+ ", fees=" + fees + ", subject=" + subject + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

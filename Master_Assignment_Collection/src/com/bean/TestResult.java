package com.bean;

public class TestResult implements Comparable<TestResult>{
	private int testid, marks, out_of_marks, cid, sid;
	private MyDate testdate;

	public TestResult(int testid, int marks, int out_of_marks, int cid, int sid, MyDate testdate) {
		super();
		this.testid = testid;
		this.marks = marks;
		this.out_of_marks = out_of_marks;
		this.cid = cid;
		this.sid = sid;
		this.testdate = testdate;
	}

	public int getTestid() {
		return testid;
	}

	public void setTestid(int testid) {
		this.testid = testid;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getOut_of_marks() {
		return out_of_marks;
	}

	public void setOut_of_marks(int out_of_marks) {
		this.out_of_marks = out_of_marks;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public MyDate getTestdate() {
		return testdate;
	}

	public void setTestdate(MyDate testdate) {
		this.testdate = testdate;
	}
	public int compareTo(TestResult t)
	{
		Integer t1=this.marks;
		Integer t2=t.marks;
		return t2.compareTo(t1);
	}
	@Override
	public String toString() {
		return "\nTestResult [testid=" + testid + ", marks=" + marks + ", out_of_marks=" + out_of_marks + ", cid=" + cid
				+ ", sid=" + sid + ", testdate=" + testdate + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

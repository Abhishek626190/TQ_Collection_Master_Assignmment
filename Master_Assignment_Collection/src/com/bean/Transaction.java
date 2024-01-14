package com.bean;

public class Transaction {
	private int sid;
	private double paidfees;
	private MyDate transactiondate;
	
	public Transaction(int sid, double paidfees, MyDate transactiondate) {
		super();
		this.sid = sid;
		this.paidfees = paidfees;
		this.transactiondate = transactiondate;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public double getPaidfees() {
		return paidfees;
	}

	public void setPaidfees(double paidfees) {
		this.paidfees = paidfees;
	}

	public MyDate getTrasactiondate() {
		return transactiondate;
	}

	public void setTrasactiondate(MyDate transactiondate) {
		this.transactiondate = transactiondate;
	}

	@Override
	public String toString() {
		return "\nTransaction [sid=" + sid + ", paidfees=" + paidfees + ", trasactiondate=" + transactiondate + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

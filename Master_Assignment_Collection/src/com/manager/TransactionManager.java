package com.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.bean.*;

public class TransactionManager {

	public static void addTransaction() {
		List<Transaction> transactionlist1 = new ArrayList<>();
		Transaction t1 = new Transaction(101, 300000, new MyDate(12, 10, 2023));
		Transaction t2 = new Transaction(102, 0, new MyDate(12, 10, 2023));
		Transaction t3 = new Transaction(103, 300000, new MyDate(12, 10, 2023));
		Transaction t4 = new Transaction(104, 185700, new MyDate(12, 10, 2023));
		Transaction t5 = new Transaction(105, 300000, new MyDate(12, 10, 2023));
		transactionlist1.add(t1);
		transactionlist1.add(t2);
		transactionlist1.add(t3);
//	 transactionlist1.add(t4);
//	 transactionlist1.add(t5);

		Academy.transactionMap.put(201, transactionlist1);

		List<Transaction> transactionlist2 = new ArrayList<>();
		Transaction t6 = new Transaction(106, 185700, new MyDate(12, 10, 2023));
		Transaction t7 = new Transaction(107, 200000, new MyDate(12, 10, 2023));
		Transaction t8 = new Transaction(108, 0, new MyDate(12, 10, 2023));
		Transaction t9 = new Transaction(109, 200000, new MyDate(12, 10, 2023));
		Transaction t10 = new Transaction(110, 105700, new MyDate(12, 10, 2023));
		transactionlist2.add(t6);
		transactionlist2.add(t7);
		transactionlist2.add(t8);
		transactionlist2.add(t9);
		transactionlist2.add(t10);

		Academy.transactionMap.put(202, transactionlist2);

		List<Transaction> transactionlist3 = new ArrayList<>();
		Transaction t11 = new Transaction(111, 100000, new MyDate(12, 10, 2023));
		Transaction t12 = new Transaction(112, 0, new MyDate(12, 10, 2023));
		Transaction t13 = new Transaction(113, 45000, new MyDate(12, 10, 2023));
		Transaction t14 = new Transaction(114, 25000, new MyDate(12, 10, 2023));
		Transaction t15 = new Transaction(115, 15000, new MyDate(12, 10, 2023));
		Transaction t16 = new Transaction(114, 75000, new MyDate(12, 12, 2023));
		Transaction t17 = new Transaction(115, 85000, new MyDate(12, 12, 2023));

		transactionlist3.add(t11);
		transactionlist3.add(t12);
		transactionlist3.add(t13);
		transactionlist3.add(t14);
		transactionlist3.add(t15);
		transactionlist3.add(t17);
		transactionlist3.add(t16);

		Academy.transactionMap.put(203, transactionlist3);

	}

	public static void printTransaction() {
		Set<Entry<Integer, List<Transaction>>> set = Academy.transactionMap.entrySet();
		Iterator<Entry<Integer, List<Transaction>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, List<Transaction>> e = itr.next();
			System.out.println("Course ID: " + e.getKey());
			System.out.println("Transaction Lists: " + e.getValue());
		}
	}

	public static void findFeePaidStudents() {
		double sum = 0;
		Iterator<Course> itr = Academy.coursesList.iterator();
		ArrayList<Student> newstdlist = new ArrayList<>();
		ArrayList<Student> notpaidfeeslist = new ArrayList<>();
		ArrayList<Student> notpaidanyfeeslist = new ArrayList<>();
		System.out.println("**********************");
		while (itr.hasNext()) {
			Course c = itr.next();
			int cid = c.getCid();
			double fees = c.getFees();
			// System.out.println("The Fees Of "+c.getCname()+"="+fees);
			Set<Entry<Integer, List<Student>>> stdset = Academy.studentMap.entrySet();
			Iterator<Entry<Integer, List<Student>>> stditr = stdset.iterator();
			while (stditr.hasNext()) {
				Entry<Integer, List<Student>> std = stditr.next();
				int id = std.getKey();
				if (id == cid) {
					List<Student> stdlist = std.getValue();
					Iterator<Student> stdlistitr = stdlist.iterator();
					while (stdlistitr.hasNext()) {
						Student s = stdlistitr.next();
						int sid = s.getSid();
						sum = 0;
						Set<Entry<Integer, List<Transaction>>> tscset = Academy.transactionMap.entrySet();
						Iterator<Entry<Integer, List<Transaction>>> tscitr = tscset.iterator();
						while (tscitr.hasNext()) {
							Entry<Integer, List<Transaction>> titr = tscitr.next();
							List<Transaction> tsclist = titr.getValue();
							Iterator<Transaction> tsclistitr = tsclist.iterator();
							while (tsclistitr.hasNext()) {
								Transaction t = tsclistitr.next();
								int tsid = t.getSid();
								if (tsid == sid) {
									sum = sum + t.getPaidfees();
								}
							}
						}
						if (sum >= fees) {
							// System.out.println(s+" Fees Paid "+sum);
							newstdlist.add(s);
							// System.out.println(sum);
						} else if (sum < fees && sum > 0) {
							notpaidfeeslist.add(s);
						} else if (sum == 0) {
							notpaidanyfeeslist.add(s);
						}

					}
				}
			}

		}

		// System.out.println(newstdlist+""+sum);
		Iterator<Student> stditr = newstdlist.iterator();
		System.out.println("List Of Student Who Paid Complete Fees");
		while (stditr.hasNext()) {
			// System.out.println("I am in most inner while");
			Student s = stditr.next();
			System.out.println(s);
		}
		System.out.println("\n**********************");
		Iterator<Student> notstditr = notpaidfeeslist.iterator();
		System.out.println("List Of Student Who Not Paid Complete Fees");
		while (notstditr.hasNext()) {
			// System.out.println("I am in most inner while");
			Student s = notstditr.next();
			System.out.println(s);
		}
		System.out.println("\n**************");
		Iterator<Student> nostditr = notpaidanyfeeslist.iterator();
		System.out.println("List Of Student Who Not Paid Any  Fees Yet ");
		while (nostditr.hasNext()) {
			// System.out.println("I am in most inner while");
			Student s = nostditr.next();
			System.out.println(s);
		}

	}
}

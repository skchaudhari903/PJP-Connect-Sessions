package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Department;

public class DepartmentAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Department deptObj = new Department(50, "TT", "NJ");
		session.save(deptObj);
		//session.delete(deptObj);
		transaction.commit();
		System.out.println("Record Inserted..");
		System.out.println(deptObj);
		session.close();
	}

}

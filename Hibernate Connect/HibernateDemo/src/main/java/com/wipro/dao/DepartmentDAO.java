package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Department;

public class DepartmentDAO {
	
	SessionFactory sessionFactory;

	public DepartmentDAO() {
		Configuration cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public String insertDepartment(Department department) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(department);
		transaction.commit();
		session.close();
		return "Successful";
	}
	
	public String updateDepartment(Department department) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(department);
		transaction.commit();
		session.close();
		return "Successful";
	}
	
	public String deleteDepartment(int deptno) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Department deptobj = new Department();
		deptobj.setDeptno(deptno);
		session.delete(deptno);
		transaction.commit();
		session.close();
		return "Successful";
	}
	
	public Department getDepartment(int deptno) {
		Session session = sessionFactory.openSession();
		Department deptobj = new Department();
		deptobj = session.get(Department.class, deptno);
		session.close();
		return deptobj;
	}
	
	public Department loadDepartment(int deptno) {
		Session session = sessionFactory.openSession();
		Department deptobj = new Department();
		deptobj = session.load(Department.class, deptno);
		session.close();
		return deptobj;
	}
	
}

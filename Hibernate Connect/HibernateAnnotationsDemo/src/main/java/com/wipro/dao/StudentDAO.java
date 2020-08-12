package com.wipro.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.bean.Student;

public class StudentDAO {
	SessionFactory factory;
	
	public StudentDAO() {
		Configuration cfg = new Configuration().configure("myconfig.cfg.xml");
		factory = cfg.buildSessionFactory();
	}
	
	public List<Student> getStudents(){
		Session session = factory.openSession();
		Query<Student> query = session.createQuery("From Student");
		return query.list();
	}
	
	public List<Student> getStudentsByCourse(String course){
		Session session = factory.openSession();
		Query<Student> query = session.createQuery("From Student std where std.course = ?0");
		query.setParameter(0, course);
		return query.list();
	}
	
	public List<Student> getStudentsTop3(){
		Session session = factory.openSession();
		Query<Student> query = session.createQuery("From Student std order by std.studentName");
		query.setMaxResults(3);
		return query.list();
	}
	
}

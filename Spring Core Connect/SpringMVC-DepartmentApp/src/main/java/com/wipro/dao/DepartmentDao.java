package com.wipro.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wipro.bean.Department;

@Repository
@Transactional
public class DepartmentDao {
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public int getDepartmentId() {
		int id = 0;
		Session session = sessionFactory.openSession();
		Query<Department> qry = session.createQuery("Select max(d.deptno) from Department d");
		List l = qry.list();
		System.out.println("L value"+l + " : " );
		
		if(l != null && l.size() > 0) {
			Object b = l.get(0);
			if(b != null)
				id = (Integer)b;
			}
			session.close();
		return id + 10;
	}
		
	public boolean insertDepartment(Department department) {
		hibernateTemplate.persist(department);
		return true;
	}
	
}

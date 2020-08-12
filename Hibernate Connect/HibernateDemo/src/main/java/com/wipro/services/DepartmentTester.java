package com.wipro.services;

import com.wipro.bean.Department;
import com.wipro.dao.DepartmentDAO;

public class DepartmentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDAO dao = new DepartmentDAO();
		Department department = new Department(80, "HEALTH", "BDC");
		String result = dao.insertDepartment(department);
		System.out.println(result);
	}

}

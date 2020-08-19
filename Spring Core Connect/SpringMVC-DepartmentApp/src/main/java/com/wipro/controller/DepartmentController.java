package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Department;
import com.wipro.dao.DepartmentDao;

@Controller
public class DepartmentController {
	@Autowired
	DepartmentDao dao;
	
	@RequestMapping("PreInsertDepartment")
	public ModelAndView preInsert() {
		Department department = new Department();
		department.setDeptno(dao.getDepartmentId());
		ModelAndView mv = new ModelAndView("InsertDepartment", "department", department);
		return mv;
	}
	
	@RequestMapping("InsertDepartment")
	public ModelAndView insertDepartment(@ModelAttribute("department") Department dept) {
		ModelAndView mv = new ModelAndView("result", "department", dept);
		if(dao.insertDepartment(dept))
			mv.addObject("msg", "Inserted Successfully");
		else
			mv.addObject("msg", "Insert Failed");
		return mv;
	}
	
}

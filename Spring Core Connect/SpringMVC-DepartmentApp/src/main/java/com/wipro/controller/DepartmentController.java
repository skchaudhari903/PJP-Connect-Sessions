package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Department;

@Controller
public class DepartmentController {
	@RequestMapping("PreInsertDepartment")
	public ModelAndView preInsert() {
		Department department = new Department();
		department.setDeptno(50);
		ModelAndView mv = new ModelAndView("InsertDepartment", "department", department);
		return mv;
	}
	
	@RequestMapping("InsertDepartment")
	public ModelAndView insertDepartment(@ModelAttribute("department") Department dept) {
		ModelAndView mv = new ModelAndView("result", "department", dept);
		return mv;
	}
	
}

package com.learningpurpose.allmarket.itemservice;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/depts")
public class DepartmentController implements RestDepartmentService {

	@Override
	public Department add(Department deparment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department update(Department deparment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getSubDepartments(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.learningpurpose.allmarket.itemservice;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RestDepartmentService {
	
	@PostMapping
	Department add(@RequestBody Department deparment);
	
	@PutMapping
	Department update(@RequestBody Department deparment);
	
	@DeleteMapping("/{id}")
	Department delete(@PathVariable Long id);
	
	@GetMapping("/{id}")
	Department get(@PathVariable Long id);
	
	@GetMapping("/sub/{id}")
	List<Department> getSubDepartments(@PathVariable Long id);
	
	@GetMapping
	List<Department> getDepartments();

}

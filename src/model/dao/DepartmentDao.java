package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void updade(Department obj);
	void deletebyId(Integer id);
	Department findById(Integer id);
	List<Department> finAll();
	List<Department> findAll();
	
	
}

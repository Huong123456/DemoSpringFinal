package application.service;

import application.model.Employee;

import java.util.List;


public interface EmployeeService {
	Iterable<Employee> findAll();

    List<Employee> search(String q);

    Employee findOne(int id);

    void save(Employee contact);

    void delete(int id);
}

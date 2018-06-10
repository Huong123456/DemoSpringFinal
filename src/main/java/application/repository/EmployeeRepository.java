package application.repository;

import java.util.List;

import application.model.Employee;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByNameContaining(String q);

}

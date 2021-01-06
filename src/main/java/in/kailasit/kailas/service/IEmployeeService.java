package in.kailasit.kailas.service;



import java.util.List;

import in.kailasit.kailas.modal.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee e);
	List<Employee> getAllEmployee();
	Employee getOneEmployee(Integer id);
	void deleteEmployee(Integer id);
	//void updateEmployee(Employee e);

}

package in.kailasit.kailas.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kailasit.kailas.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	

}

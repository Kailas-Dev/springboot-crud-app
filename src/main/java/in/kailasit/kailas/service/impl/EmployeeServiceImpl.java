package in.kailasit.kailas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kailasit.kailas.cexception.EmployeeNotFoundException;
import in.kailasit.kailas.modal.Employee;
import in.kailasit.kailas.rep.EmployeeRepository;
import in.kailasit.kailas.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Integer saveEmployee(Employee e) {
		Integer id=repo.save(e).getEmpId();
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list=repo.findAll();
		return list;
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt=repo.findById(id);
		
		Employee emp=opt.orElseThrow(() -> new EmployeeNotFoundException("Employee not exist"));
		return emp;
	}

	@Override
	public void deleteEmployee(Integer id) {
		Employee emp=getOneEmployee(id);
		repo.delete(emp);

	}



}

package autowiring.sterotype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import autowiring.sterotype.domain.Employee;
import autowiring.sterotype.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;
	@Override
	public void save(Employee employee) {
		//validation yapılır .
		empRepository.save(employee);
	}

}

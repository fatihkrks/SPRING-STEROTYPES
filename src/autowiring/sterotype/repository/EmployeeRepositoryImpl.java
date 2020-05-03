package autowiring.sterotype.repository;

import org.springframework.stereotype.Repository;

import autowiring.sterotype.domain.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public void save(Employee employee) {
		System.out.println("EmployeeRepositoryImpl");
	}

}

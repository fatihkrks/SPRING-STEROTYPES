package autowiring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiring.sterotype.domain.Employee;

public class test {
	public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext-autowiring.xml");
			Employee employee=context.getBean("employeeId",Employee.class);
			System.out.println(employee);
	}
}

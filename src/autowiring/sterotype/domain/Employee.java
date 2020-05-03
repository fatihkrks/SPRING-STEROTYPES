package autowiring.sterotype.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "configuration.properties")
public class Employee {
	@Value(value = "${name}")
		private String name;
	
	@Value(value = "${surname}")
		private String surname;
		
		@Autowired
		private Department department;
		@Autowired
		private Address address;
	
		@Override
		public String toString() {
			return "Employee [name=" + name + ", surname=" + surname + ", department=" + department + ", address="
					+ address + "]";
		}
		
		
}

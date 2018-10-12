import java.util.ArrayList;
import java.util.List;


public class TestJava8Filter {

	
	public static void main(String[] args) {
		
		Address address = new Address("Pune");
		Address address1 = new Address("Mumbai");
		Address address2 = new Address("Sangli");
		
		Employee emp = new Employee("ABC", "XYZ", address);
		Employee emp1 = new Employee("ABC1", "XYZ1", address1);
		Employee emp2 = new Employee("ABC2", "XYZ2", address2);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		
		 String latName = list.stream()
	                .filter((x) -> "ABC".equals(x.getName()) && "Pune".equals(x.getAddress().getName()))
	                .map(Employee::getLastName)                       //convert stream to String
	                .findAny()
	                .orElse("");
		 
		 System.out.println(latName);
		
	}
}

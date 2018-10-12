import java.util.HashMap;
import java.util.Map;


public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setLastName("ABC");
		emp.setName("XYZ");
		
		Map<Employee ,String> map = new HashMap<Employee, String>();
		map.put(emp, "ABC");
		
	}

}

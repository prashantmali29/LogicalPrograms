

public class TestComparable {

	
	int id = 10 ;
	
	
	@Override
	public String toString() {
		return "TestComparable [id=" + id + "]";
	}


	public static void main(String[] args) {
		
		TestComparable t = new TestComparable();
		System.out.println(t.toString());
	}

}
